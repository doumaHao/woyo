package cn.douma.woyo.util;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * 封装各种生成唯一性ID算法的工具类.
 * @author ThinkGem
 * @version 2013-01-15
 */
@Service
@Lazy(false)
public class IdGen {

	private static SecureRandom random = new SecureRandom();
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 使用SecureRandom随机生成Long. 
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}

	/**
	 * 获得指定位数的随机整数类型
	 * @param i
	 * @return
	 */
	public static int randomInt(int i){
		if(i > 4 && i< 10){
			StringBuffer sb = new StringBuffer();
			sb.append("1");
			for(int j=0; j<i-1; j++){
				sb.append(random.nextInt(10));
			}
			return Integer.valueOf(sb.toString());
		} else {
			throw new IllegalArgumentException("只能随机得到5-9位的整形");
		}
	}

	/**
	 * 获得指定位数的随机字符类型
	 * @param i
	 * @return
	 */
	public static String randomString(int i){
		if(i > 4 && i< 33){
			StringBuffer sb = new StringBuffer();
			int times = i/9;
			int mods = i%9;
			if(mods == 0){
				for(int j=0; j<times; j++){
					sb.append(randomInt(9));
				}
			} else if(mods > 4){
				for(int j=0; j<times; j++){
					sb.append(randomInt(9));
				}
				sb.append(randomInt(mods));
			} else {
				int mods1 = 0;
				int mods2 = 0;
				if((mods+9)%2 == 0){
					mods1 = (mods+9)/2;
					mods2 = mods1;
				} else {
					mods1 = (mods+9)/2;
					mods2 = mods1+1;
				}
				for(int j=0; j<times-1; j++){
					sb.append(randomInt(9));
				}
				sb.append(randomInt(mods1));
				sb.append(randomInt(mods2));
			}
			return sb.toString();
		} else {
			throw new IllegalArgumentException("只能随机得到5-32位的字符串");
		}
	}
	
	
	/**
     * 批次号生成
     * 生成规则：当天日期[8位]+序列号[3至24位]，如：201008010000001
     * @param  minSize
     * 		   maxSize
     * @return
     */
    public static String RandomBatchNum(int minSize,int maxSize){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String format = dateFormat.format(new Date());
         Random random = new Random();
          int s = random.nextInt(maxSize)%(maxSize-minSize+1) + minSize;
          StringBuffer buffer =new StringBuffer();
          for(int i=0;i<s;i++)
          {
              Integer val = (int)(Math.random()*9+1);
              buffer.append(val.toString());
          }
        return format+buffer.toString();
    }
}
