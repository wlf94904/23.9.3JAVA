package com.haha.try_;

/**
 * @author hhm
 * @version 1.0
 */
public class TryCatchDetail03 {
    /*
    try-finally相当于没有捕获异常，
    因此程序会直接崩掉或退出，
    应用场景：执行一块代码，无论是否发生异常，都必须执行某个业务逻辑
     */
    public static void main(String[] args) {
        try{
            int n1=10;
            int n2=0;
            System.out.println(n1/n2);

        }finally {
            System.out.println("执行了finally...");


        }
        System.out.println("程序继续执行...");

    }
}
