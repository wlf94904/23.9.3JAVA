package com.haha.wrapper;

/**
 * @author hhm
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int<-->Integer的装箱和拆箱
        //jdk5前手动装箱和拆箱
        //手动装箱 int-->Integer
        int n1=100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        //Integer-->int
        int i = integer.intValue();

        //jdk5及以后，就可以自动装箱和拆箱
        int n2=200;
        //自动装箱 int-->Integer
        Integer integer2=n2;//底层使用的是 Integer.valueOf(n2)
        //自动拆箱 Integer-->int
        int n3=integer2;//底层使用的是intValut()方法

    }
}
