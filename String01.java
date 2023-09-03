package com.haha.String_;

/**
 * @author hhm
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //1.String对象用于保存字符串，也就是一组字符序列
        //2."jack"字符串常量，双引号括起的字符序列
        //3.字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节
        //4.String有很多构造器，实现了构造器的重载
        //常用的有
        //String s1=new String();
        //String s2=new String(String original);
        //String s3=new String(char[] a);
        //String s4=new String(char[] a,int StartIndex,int count);
        //String s5=new String(byte[] b);
        //5.String类实现了接口Serializable[String可以串行化：可以在网络传输]
        //和接口Comparable[String对象可以比较大小]
        //6.String是final类，不能被其他的类继承
        //7.String有属性private final char value[];用于存放字符串内容
        //8.一定要注意，value是final类型，不可修改（地址不可修改，不是字符内容不可修改）
        String name="jack";
        name="Tom";
        final char[] value={'a','b','c'};
        char[] v2={'t','o','m'};
        value[0]='h';
        //value=v2;不可以修改value地址
        

    }
}
