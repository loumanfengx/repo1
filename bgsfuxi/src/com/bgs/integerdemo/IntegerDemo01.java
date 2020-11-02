package com.bgs.integerdemo;

/**
 * @ClassName: IntegerDemo01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/8 18:43
 * @Version: v1.0
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        int compare = Integer.compare(1, 2);
        System.out.println(compare);
        int x = 3, y = 2;
        int i = x < y ? -1 : (x == y ? 0 : 1);
        System.out.println(i);
        int max = Integer.max(2, 3);
        System.out.println(max);
        int i1 = Integer.parseInt("123");
        System.out.println(i1);
        System.out.println(Integer.reverse(123456));
    }
}
