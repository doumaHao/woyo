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

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 验证日期格式的正则表达式
     * （支持润、平年）
     */
    private static String regex = "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})"
            + "-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))"
            + "|(02-(0[1-9]|[1][0-9]|2[0-8])))";

    /**
     * 获取系统时间
     * @return
     */
    public static Date getNow(){
        return new Date();
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
     * 获取指定月的第一天日期
     *
     * @param floatMonths 以当前月为基数，0为当前月；1为下一个月；-1为上一个月；以此类推。
     * @return
     */
    public static Date getFirstDayOfCurrentMonth(int floatMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, floatMonths);
        calendar.set(Calendar.DAY_OF_MONTH, 1); //设置为1号,即本月第一天
        return calendar.getTime();
    }

    /**
     * 获取指定月的最后一天日期
     *
     * @param floatMonths 以当前月为基数，0为当前月；1为下一个月；-1为上一个月；以此类推。
     * @return
     */
    public static Date getLastDayOfCurrentMonth(int floatMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, floatMonths);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    /**
     * 获得指定日期的前一天（如specifiedDay为2015-07-01，则返回值为2015-06-30）
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayBefore(String specifiedDay) {
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date);
        int day = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE, day - 1);
        String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        return dayBefore;
    }

    /**
     * 获得指定日期的后一天（如specifiedDay为2015-06-30，则返回值为2015-07-01）
     *
     * @param specifiedDay
     * @return
     * @throws Exception
     */
    public static String getSpecifiedDayAfter(String specifiedDay) {
        Calendar calendar = Calendar.getInstance();
        Date date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date);
        int day = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE, day + 1);
        String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
        return dayAfter;
    }

    /**
     * 日期转换成字符串
     *
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        return format.format(date);
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
            date = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
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
}
