package com.bgs.stringdemo;

/**
 * @ClassName: String01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/8 10:34
 * @Version: v1.0
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmn";
        String str2 = "opqrstuvwxyz";
        /*int indexOf(int ch)
        返回指定字符第一次出现的字符串内的索引。*/
        int i = str1.indexOf('e');
        System.out.println(i);
        /*String concat(String str)
        将指定的字符串连接到该字符串的末尾。*/
        String concat = str1.concat(str2);
        int a = 1;
        System.out.println(concat+1+"-->"+concat.length());
        boolean equals = str1.equals(str2);
        System.out.println(equals);

        char[] ch = {'a', 'b', 'c', 'd'};
        String s = String.valueOf(ch);
        System.out.println(s);

    }
}
