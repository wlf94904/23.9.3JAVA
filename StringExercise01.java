package com.haha.String_;

/**
 * @author hhm
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        b="c";
        a="m";
        System.out.println(a==b);
        System.out.println(b.hashCode());
        System.out.println(a.hashCode());

    }
}
