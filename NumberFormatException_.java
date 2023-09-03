package com.haha.exception_;

/**
 * @author hhm
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name="hha";
        //将String转成int
        int num=Integer.parseInt(name);//抛出NumberFormatException异常
        System.out.println(num);
    }
}
