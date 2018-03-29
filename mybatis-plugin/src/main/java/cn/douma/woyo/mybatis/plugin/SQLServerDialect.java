package cn.douma.woyo.mybatis.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * mysql方言
 *
 * @author Li Shaohua
 * @create 2017-08-21 下午2:04
 **/
public class SQLServerDialect implements Dialect {
    public XmlElement addPageableToSelectByExample(XmlElement element, IntrospectedTable introspectedTable) {
        return null;
    }

    public void addPageableSuffix(Document document, IntrospectedTable introspectedTable) {

    }
}
