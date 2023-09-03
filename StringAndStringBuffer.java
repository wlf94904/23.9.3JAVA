package com.haha.stringbuffer_;

/**
 * @author hhm
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String-->StringBuffer
        String str="hello tom";
        //方式1:使用构造器
        //注意：返回的才是StringBuffer对象，对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2：使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer-->String
        StringBuffer stringBuffer3 = new StringBuffer("哈哈哈诶");
        //方法1：使用StringBuffer的toString方法
        String s = stringBuffer3.toString();

        //方法2：使用构造器来搞定
        String s1 = new String(stringBuffer3);



    }
}
