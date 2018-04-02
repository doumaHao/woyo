package cn.douma.woyo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期工具类
 *
 * @author Administrator
 */
public class DateUtil {

    final public static SimpleDateFormat sdf_yyyMM = new SimpleDateFormat("yyyy-MM");
    final public static SimpleDateFormat sdf_yyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
    final public static SimpleDateFormat sdf_yyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    final public static SimpleDateFormat sdf_yyyMMddHHmmss2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    final public static SimpleDateFormat sdf_yyyyMMddHHmmssSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    /**
     * 验证日期格式的正则表达式
     * （支持润、平年）
     */
    private static String regex = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})"
            + "-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))"
            + "|(02-(0[1-9]|[1][0-9]|2[0-8])))";

    /**
     * 获取系统当前时间
     *
     * @return
     */
    public static Date getSysNow() {
        return new Date(System.currentTimeMillis());
    }

    /**
     * 获取日期的年
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取日期的月
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH);
    }

    /**
     * 获取日期的日
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }


    /**
     * 获取月第一天日期
     *
     * @param floatMonths 以当前月为基数，0为当前月；1为下一个月；-1为上一个月；以此类推。
     * @return
     */
    public static Date getFirstDayOfMonth(int floatMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, floatMonths);
        calendar.set(Calendar.DAY_OF_MONTH, 1); //设置为1号,即本月第一天
        return calendar.getTime();
    }

    /**
     * 获取月最后一天日期
     *
     * @param floatMonths 以当前月为基数，0为当前月；1为下一个月；-1为上一个月；以此类推。
     * @return
     */
    public static Date getLastDayOfMonth(int floatMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, floatMonths);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 获得日期的对应其他日期（前后N年，前后N月，前后N日）
     *
     * @param date  标准日期
     * @param year  前后N年 0表示本年
     * @param month 前后N月 0表示本月
     * @param day   前后N日0表示本日
     * @return
     */
    public static Date getSpecifiedDay(Date date, int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int thisYear = calendar.get(Calendar.YEAR);
        int thisMonth = calendar.get(Calendar.MONTH);
        int thisDay = calendar.get(Calendar.DATE);
        calendar.set(Calendar.YEAR, thisYear + year);
        calendar.set(Calendar.MONTH, thisMonth + month);
        calendar.set(Calendar.DATE, thisDay + day);
        return calendar.getTime();
    }

    /**
     * 获得今天的对应其他日期（前后N年，前后N月，前后N日）
     *
     * @param year  前后N年 0表示本年
     * @param month 前后N月 0表示本月
     * @param day   前后N日0表示本日
     * @return
     */
    public static Date getSpecifiedDay(int year, int month, int day) {
        Date date = new Date();
        return getSpecifiedDay(date, year, month, day);
    }

    /**
     * 日期转换成字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return sdf_yyyMMdd.format(date);
    }

    /**
     * @param date
     * @param sdf
     * @return
     */
    public static String dateToString(Date date, SimpleDateFormat sdf) {
        if (date == null) {
            return null;
        }
        return sdf.format(date);
    }

    /**
     * 字符串转换成日期
     *
     * @param string
     * @return date
     */
    public static Date stringToDate(String string) {
        Date date = null;
        try {
            date = sdf_yyyMMdd.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 整型转换成日期
     *
     * @param year
     * @param month
     * @return
     */
    public static Date intToDate(int year, int month) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        String thisTimeStr = String.valueOf(year);
        if (month >= 10) {
            thisTimeStr = thisTimeStr + "-" + month;
        } else {
            thisTimeStr = thisTimeStr + "-0" + month;
        }
        calendar.setTime(sdf_yyyMM.parse(thisTimeStr));
        return calendar.getTime();
    }

    /**
     * 整形转换成日期字符串
     *
     * @param year
     * @param month
     * @return
     * @throws ParseException
     */
    public static String intToDateString(int year, int month) throws ParseException {
        return dateToString(intToDate(year, month));
    }

    /**
     * 验证字符串是否是日期格式
     *
     * @param date
     * @return
     */
    public static boolean checkDateRegex(String date) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        boolean flag = matcher.matches();
        return flag;
    }

    /**
     * 日期比较大小
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int dateCompare(String date1, String date2) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        try {
            c1.setTime(formatter.parse(date1));
            c2.setTime(formatter.parse(date2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c1.compareTo(c2);
    }

    /**
     * 日期比较大小
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int dateCompare(Date date1, Date date2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        return c1.compareTo(c2);
    }

    /**
     * 字符串格式的日期，计算两日期相差的天数，闭区间[date1, date2]。
     *
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int daysBetween(String date1, String date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date1));
        long time1 = cal.getTimeInMillis();
        cal.setTime(sdf.parse(date2));
        long time2 = cal.getTimeInMillis();
        long between_days = (time2 - time1) / (24 * 60 * 60 * 1000) + 1;
        return Integer.parseInt(String.valueOf(between_days));
    }

    /**
     * 计算两个日期之间的分钟
     *
     * @param date1
     * @param date2
     * @return
     * @throws ParseException
     */
    public static int minutesBetween(Date date1, Date date2) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        long time1 = cal.getTimeInMillis();
        cal.setTime(date2);
        long time2 = cal.getTimeInMillis();
        long between_minutes = (time2 - time1) / (60 * 1000);
        return Integer.parseInt(String.valueOf(between_minutes));
    }

    /**
     * 计算两日期相差的小时数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int hoursBetween(Date date1, Date date2) {
        int hoursBetween = minutesBetween(date1, date2);
        return Integer.parseInt(String.valueOf(hoursBetween / 60));
    }

    /**
     * 字符串格式的日期，计算两日期相差的天数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int daysBetween(Date date1, Date date2) {
        int minutesBetween = hoursBetween(date1, date2);
        return Integer.parseInt(String.valueOf(minutesBetween / 24));
    }

    /**
     * 计算两个日期之间的月数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int monthBetween(Date date1, Date date2) {
        int daysBetween = daysBetween(date1, date2);
        return Integer.parseInt(String.valueOf(daysBetween / 30));
    }

    /**
     * 计算两个日期之间的年数
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int yearsBetween(Date date1, Date date2) {
        int yearsBetween = monthBetween(date1, date2);
        return Integer.parseInt(String.valueOf(yearsBetween / 12));
    }

    /**
     * 获取该日期前N个月的日期
     *
     * @param date
     * @param num  num为正说明获取的N个月之后，N为负说明获取N个月之前
     * @return
     */
    public static Date getDateWithMonth(Date date, int num) {
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(calendar.MONTH, num);
            return calendar.getTime();
        } else {
            return null;
        }
    }

    /**
     * 传入的年和月是否在指定日期的N个月内
     *
     * @param inMonth
     * @param date
     * @param year
     * @param month
     * @return
     */
    public static boolean inThisTime(int inMonth, Date date, int year, int month) throws ParseException {
        Calendar aft = Calendar.getInstance();
        Calendar bef = Calendar.getInstance();
        bef.setTime(intToDate(year, month));
        aft.setTime(date);
        int r = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int m = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        if (inMonth > Math.abs(m + r)) {
            return true;
        } else {
            return false;
        }
    }

}