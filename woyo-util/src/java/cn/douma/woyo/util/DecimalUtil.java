package cn.douma.woyo.util;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 数值工具类
 *
 * @author Administrator
 */
public class DecimalUtil {

    final static BigInteger HUNDRED = BigInteger.valueOf(100);

    /**
     * 返回2位小数的金额格式  比如 1,234.56
     *
     * @param in
     * @return
     */
    static public String getMoneyFormat(String in) {
        String out = "0.00";
        if (StringUtils.isNotBlank(in)) {
            out = getMoneyFormat(new BigDecimal(in));
        }
        return out;
    }

    /**
     * 返回2位小数的金额格式  比如 1,234.56
     *
     * @param in
     * @return
     */
    static public String getMoneyFormat(BigDecimal in) {
        String out = "0.00";
        if (in != null) {
            in = in.divide(BigDecimal.ONE, 2, BigDecimal.ROUND_HALF_DOWN);
            out = String.valueOf(in);
            String[] outs = out.split("\\.");
            if (outs[0].length() > 3) {
                String outs1 = "";
                for (int i = outs[0].length(); i >= 0; i--) {
                    outs1 = outs[0].substring(outs[0].length() - 1, outs[0].length()) + outs1;
                    outs[0] = outs[0].substring(0, outs[0].length() - 1);
                    if (outs[0].length() > 0) {
                        if (outs1.replaceAll(",", "").length() % 3 == 0) {
                            outs1 = "," + outs1;
                        }
                    } else {
                        break;
                    }
                }
                out = outs1 + "." + outs[1];
            }
        }
        return out;
    }

    /**
     * 求平方根
     *
     * @param number
     * @return
     */
    static public BigDecimal sqrt(BigDecimal number) {
        //精度
        int scale = 2;
        //舍入方式
        int roundingMode = BigDecimal.ROUND_HALF_DOWN;
        if (number.compareTo(BigDecimal.ZERO) < 0)
            throw new ArithmeticException("sqrt with negative");
        BigInteger integer = number.toBigInteger();
        StringBuffer sb = new StringBuffer();
        String strInt = integer.toString();
        int lenInt = strInt.length();
        if (lenInt % 2 != 0) {
            strInt = '0' + strInt;
            lenInt++;
        }
        BigInteger res = BigInteger.ZERO;
        BigInteger rem = BigInteger.ZERO;
        for (int i = 0; i < lenInt / 2; i++) {
            res = res.multiply(BigInteger.TEN);
            rem = rem.multiply(HUNDRED);

            BigInteger temp = new BigInteger(strInt.substring(i * 2, i * 2 + 2));
            rem = rem.add(temp);

            BigInteger j = BigInteger.TEN;
            while (j.compareTo(BigInteger.ZERO) > 0) {
                j = j.subtract(BigInteger.ONE);
                if (((res.add(j)).multiply(j)).compareTo(rem) <= 0) {
                    break;
                }
            }
            res = res.add(j);
            rem = rem.subtract(res.multiply(j));
            res = res.add(j);
            sb.append(j);
        }
        sb.append('.');
        BigDecimal fraction = number.subtract(number.setScale(0, BigDecimal.ROUND_DOWN));
        int fracLen = (fraction.scale() + 1) / 2;
        fraction = fraction.movePointRight(fracLen * 2);
        String strFrac = fraction.toPlainString();
        for (int i = 0; i <= scale; i++) {
            res = res.multiply(BigInteger.TEN);
            rem = rem.multiply(HUNDRED);

            if (i < fracLen) {
                BigInteger temp = new BigInteger(strFrac.substring(i * 2, i * 2 + 2));
                rem = rem.add(temp);
            }

            BigInteger j = BigInteger.TEN;
            while (j.compareTo(BigInteger.ZERO) > 0) {
                j = j.subtract(BigInteger.ONE);
                if (((res.add(j)).multiply(j)).compareTo(rem) <= 0) {
                    break;
                }
            }
            res = res.add(j);
            rem = rem.subtract(res.multiply(j));
            res = res.add(j);
            sb.append(j);
        }
        return new BigDecimal(sb.toString()).setScale(scale, roundingMode);
    }

    /**
     * 求平方
     *
     * @param number
     * @return
     */
    static public BigDecimal square(BigDecimal number) {
        return number.multiply(number);
    }

    public static void main(String[] args) {
        System.out.println(sqrt(new BigDecimal(8)));
    }

}
