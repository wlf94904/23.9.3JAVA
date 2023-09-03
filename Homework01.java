package com.haha.homework_;

import com.haha.exception_.ArrayIndexOutOfBoundsException_;

/**
 * @author hhm
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        /*
        编写应用程序EcmDef.java，接收命令行的两个参数（整数），计算两数相除
        计算两个数相除，要求用方法cal（int n1,int n2)
        对数据格式不正确（NumberFormatException),缺少命令行参数（ArrayIndexOutOfBoundsException)、
        除0（ArithmeticException)异常处理
         */

        try {
            //先验证输入的参数的个数是否为正确，2个参数
            if(args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            //先把接收到的参数，转成整数
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            System.out.println(n1+n2);

            double res=cal(n1,n2);//该方法可能抛出ArithmeticException异常
            System.out.println("计算结果="+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确，需要输入整数");
        }catch(ArithmeticException e){
            System.out.println("除数不可以为0");
        }

    }
    //编写cal方法，计算两个数的商
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}
