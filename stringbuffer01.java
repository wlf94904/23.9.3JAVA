package com.haha.stringbuffer_;

/**
 * @author hhm
 * @version 1.0
 */
public class stringbuffer01 {
    public static void main(String[] args) {
        //1.StringBuffer的直接父类是AbstractStringBuilder
        //2.StringBuffer实现了Serializable,即StringBuffer的对象可以串行化
        //3.在父类中，AbstractStringBuilder有属性char[] value,不是final类型
        //该value数组存放字符串内容，因此存放在堆中
        //4.StringBuffer是一个final类，不能被继承
        //5.因为StringBuffer字符内容是存在char[] value，所以在变化（增加/减少）
        //   不用每次都更换地址（即不是每次创建新对象），所以效率高于String
        StringBuffer stringBuffer = new StringBuffer();


    }
}
