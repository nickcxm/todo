package com.nickc.todo.util;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.util.Random;

/**
 * Created by 程旭敏 on 2019/1/11.
 */
public class PasswordUtil {

    /**
     * 根据盐值和密码生成加密的密码
     * @param pass
     * @param salt
     * @return
     */
    public static String genPass(String pass,String salt){
        pass=md5Hex(pass+salt);
        char[] cs=new char[48];
        for (int i=0;i<48;i+=3){
            cs[i] = pass.charAt(i / 3 * 2);
            char c = salt.charAt(i / 3);
            cs[i + 1] = c;
            cs[i + 2] = pass.charAt(i / 3 * 2 + 1);
        }
        return new String(cs);
    }

    /**
     * 校验密码是否正确
     * @param password
     * @param salt
     * @param oldPass
     * @return
     */
    public static boolean verify(String password,String salt,String oldPass) {
        String newPass=genPass(password,salt);
        if (newPass!=null&&newPass.equals(oldPass)){
            return true;
        }
        return false;
    }


    /**
     * 生成盐值
     * @return
     */
    public static String genSalt(){
        Random random=new Random();
        StringBuilder sb=new StringBuilder(16);
        sb.append(random.nextInt(99999999)).append(random.nextInt(99999999));
        int len=sb.length();
        if (len<16){
            for (int i=0;i<16-len;i++){
                sb.append(0);
            }
        }
        return sb.toString();
    }

    /**
     * 十六进制字符串形式的md5摘要
     * @param src
     * @return
     */
    public static String md5Hex(String src){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] bs=md.digest(src.getBytes());
            return new String(new Hex().encode(bs));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) {
        String pass="cxmnickc";
        String salt=genSalt();
        String password=genPass(pass,salt);

        boolean correct=verify(pass,salt,password);
    }
}
