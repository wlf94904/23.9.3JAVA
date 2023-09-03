package com.haha.String_;

/**
 * @author hhm
 * @version 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //1.toUpperCase转换成大写
        String s = "hello";
        System.out.println(s.toUpperCase());
        System.out.println(s);
        //2.toLowerCase转换成小写
        System.out.println(s.toLowerCase());
        //3.concat拼接字符串
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);
        //4.replace替换字符串中的字符
        s1 = "宝玉 and 薛宝钗 薛宝钗 薛宝钗";
        //s1.replace()方法执行后，返回的结果才是替换过的
        //注意对s1没有影响,即真正变化的是返回的结果
        String s11 = s1.replace("薛宝钗", "林黛玉");//将所有的薛宝钗换成林黛玉
        System.out.println(s1 + " ******" + s11);
        //5.split分割字符串，对于某些分割字符，我们需要转义，比如|\\等
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        //1.以,为标准对poem进行分割，返回一个数组
        //2.在对字符串进行分割时，如果有特殊字符，
        String[] split = poem.split("，");
        poem = "E:\\aaa\\bbb";
        split = poem.split("\\\\");
        System.out.println("===分割后内容===");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //6.toCharArray转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        //7.compareTo比较两个字符串的大小，若前者大，则返回正数，
        // 若后者大，则返回负数，若相等，则返回0
        //（1）如果长度相同，并且每个字符也相同，就返回0
        //(2)如果长度相同或者不相同，但是在进行比较时，可以区分大小
        //    就返回if(c1!=c2){
//                  return c1 - c2;
//                  }
        //(3)若前面的部分都相同，就返回str1.len-str2.len
        String a="jchn";
        String b="jack";
        System.out.println(a.compareTo(b));
        //8.format格式字符串
        String name="john";
        int age=10;
        double score=56.897;
        char gender='男';
        //将所有的信息都拼接在一个字符串
        String info=
                "我的姓名是"+name+"年龄是"+age+"，成绩是"+score+",性别是"+gender+"，希望大家喜欢我！";
        System.out.println(info);
        //1.%s,%d,%.2f,%c称为占位符，
        //2.这些占位符由后面变量来替换
        //3.%s表示后面由字符串来替换
        //4.%d是整数替换
        //5.%.2f表示用小数来替换，替换后，只会保留小数点后两位，并且进行四舍五入的处理
        //6.%c使用char类型来替换

        String formatStr="我的姓名是%s年龄是%d，成绩是%.2f性别是%c。希望大家喜欢我！";
        String info2=String.format(formatStr,name,age,score,gender);
        System.out.println("info2="+info2);
    }
}
