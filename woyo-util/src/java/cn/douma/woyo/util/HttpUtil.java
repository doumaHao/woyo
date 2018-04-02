/*
 * Copyright (c) 2017. magfin.cn, All Rights Reserved
 * Project Name : channel
 * File Name : HttpUtil.java
 * Date : 17-5-22 上午10:12
 * Author : Douma Hao
 *
 */

package cn.douma.woyo.util;

import cn.douma.woyo.util.entity.HttpResponseResult;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpUtil {

    private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

    public static final String CONNECT_HTTP = "http";

    public static final String CONNECT_HTTPS = "https";

    public static final String CONTENT_CHARSET = "UTF-8";

    public static final String DATA_TYPE_FORM = "FORM";

    public static final String DATA_TYPE_JSON = "JSON";

    private static int connectionTimeout = 5000;

    private static int socketTimeout = 5000;

    /**
     * 获取连接
     *
     * @param connectType
     * @return
     * @throws Exception
     */
    public static HttpClient getHttpClient(String connectType) throws Exception {
        HttpClient httpClient = null;
        if (CONNECT_HTTP.equals(connectType)) {
            httpClient = new DefaultHttpClient();
        } else if (CONNECT_HTTPS.equals(connectType)) {
            httpClient = new SSLClient();
        } else {
            throw new IllegalArgumentException("连接方式未知");
        }
        if (httpClient != null) {
            //请求超时
            httpClient.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connectionTimeout);
            //读取超时
            httpClient.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, socketTimeout);
            //Content-Type的字符编码
            httpClient.getParams().setParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET, CONTENT_CHARSET);
        }
        return httpClient;
    }

    /**
     * 获取get请求
     *
     * @param url
     * @param params
     * @return
     */
    public static HttpGet getHttpGet(String url, Map<String, String> params) {
        String getUrl = url;
        if (params != null && params.keySet() != null && params.keySet().size() > 0) {
            for (String s : params.keySet()) {
                //如果已经包含？，则只需要&连接其他参数即可
                if (getUrl.indexOf("?") > 0) {
                    getUrl += "&" + s + "=" + params.get(s);
                }
                //如果没有？，则第一个参数需要？连接
                else {
                    getUrl += "?" + s + "=" + params.get(s);
                }
            }
        }
        HttpGet httpGet = new HttpGet(getUrl);
        return httpGet;
    }

    /**
     * 获取post请求 form表单格式
     *
     * @param url
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    public static HttpPost getHttpPost(String dataType, String url, Map<String, String> params) throws UnsupportedEncodingException {
        HttpPost httpPost = new HttpPost(url);
        //form表单格式提交的post
        if(DATA_TYPE_FORM.equals(dataType)){
            httpPost.addHeader("Content-type", "application/x-www-form-urlencoded");
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if (params != null && params.keySet() != null && params.keySet().size() > 0) {
                for (String s : params.keySet()) {
                    nvps.add(new BasicNameValuePair(s, params.get(s)));
                }
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, CONTENT_CHARSET));
        }
        //json格式提交的post
        else if(DATA_TYPE_JSON.equals(dataType)){
            String mapJson = JsonUtil.toJsonString(params);
            httpPost.addHeader("Content-type", "application/json; charset=UTF-8");
            httpPost.setHeader("Accept", "application/json");
            StringEntity entity = new StringEntity(mapJson, CONTENT_CHARSET);
            httpPost.setEntity(entity);
        }
        return httpPost;
    }

    /**
     * 执行请求，获取返回报文
     *
     * @param httpClient
     * @param httpRequestBase
     * @return
     * @throws IOException
     */
    public static HttpResponseResult doRequest(HttpClient httpClient, HttpRequestBase httpRequestBase) throws IOException {
        HttpResponseResult httpResponseResult = new HttpResponseResult();
        String responseMsg = null;
        HttpResponse response = httpClient.execute(httpRequestBase);
        if (response != null) {
            HttpEntity resEntity = response.getEntity();
            if (resEntity != null) {
                responseMsg = EntityUtils.toString(resEntity, HttpUtil.CONTENT_CHARSET);
            }
            httpResponseResult.setCode(response.getStatusLine().getStatusCode());
            httpResponseResult.setResponseMsg(responseMsg);
        } else {
            httpResponseResult.setCode(-100);
        }
        return httpResponseResult;
    }

    /**
     * SSL https连接类
     */
    public static class SSLClient extends DefaultHttpClient {
        public SSLClient() throws Exception {
            super();
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            ClientConnectionManager ccm = this.getConnectionManager();
            SchemeRegistry sr = ccm.getSchemeRegistry();
            sr.register(new Scheme("https", 443, ssf));
        }
    }
}
