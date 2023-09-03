package com.haha.exception_;

/**
 * @author hhm
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;

//        int res=num/num2;
//如果程序员，认为一段代码可能出现异常/问题，可以使用try-catch异常处理机制来解决
        // 从而保证程序的健壮性

        try {
            int res=num1/num2;
        } catch (Exception e) {
//            System.out.println("出现异常的原因="+e.getMessage());
            throw new RuntimeException(e);
//            e.printStackTrace();
        }

        System.out.println("程序继续运行。。。");
    }
}
