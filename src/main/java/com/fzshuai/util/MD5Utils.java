package com.fzshuai.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 软件二班傅同学
 * @date 2021-01-22 22:31
 */
public class MD5Utils {

    public static String  code(String str) {

        try {
            MessageDigest md = null;
            md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");

            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            //32位密码
            return buf.toString();
            //16位密码
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {

        System.out.println(code("123"));
    }

}
