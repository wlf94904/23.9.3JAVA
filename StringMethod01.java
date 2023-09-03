package com.haha.String_;

/**
 * @author hhm
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1.equals比较内容是否相同，区分大小写
        String str1="hello";
        String str2="Hello";
        System.out.println(str1.equals(str2));
        //2.equalsIgnoreCase忽略大小写，判断内容是否一致
        String username="johN";
        if("john".equalsIgnoreCase(username)){
            System.out.println("Success!");
        }else{
            System.out.println("Failure!");
        }
        //3.length()获取字符的个数，字符串的长度
        System.out.println("哈哈".length());
        //4.indexOf获取字符在字符串对象中第一次出现的索引，索引从0开始，如果找不到，返回-1
        String s1="wer@terwe@g'";
        int index=s1.indexOf('@');
        System.out.println(index);
        System.out.println("weIndex="+s1.indexOf("we"));

        //5.lastIndexOf获取字符在字符串中最后一次出现的索引，索引从0开始，如果找不到，返回-1
        index=s1.lastIndexOf('@');
        System.out.println(index);
        //6.subString截取指定范围的子串
        String name="hello,张三";
        System.out.println(name.substring(6));//从6开始，后面都截取
        System.out.println(name.substring(0,5));//从第0个开始，截取到索引5-1=4的位置


    }
}
