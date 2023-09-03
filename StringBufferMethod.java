package com.haha.stringbuffer_;

/**
 * @author hhm
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hello");
        //增
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);
        System.out.println(s);
        //删
        //删除11~14的字符，但是不包含14，[11,14)
        s.delete(11,14);
        System.out.println(s);
        //改
        //使用周芷若替换索引9-11的字符，[9,11)
        s.replace(9,11,"周芷若");
        System.out.println(s);
        //查找指定的子串在字符串第一次出现的索引，如果找不到就返回-1
        int indexOf=s.indexOf("张三丰");
        System.out.println(indexOf);
        //插
        //hello，张三丰周芷若true10.5
        //在索引为9的位置插入字符串“赵敏”,原来索引为9的内容自动往后移
        s.insert(9,"赵敏");
        System.out.println(s);
        //长度
        System.out.println(s.length());
        System.out.println(s);

    }
}
