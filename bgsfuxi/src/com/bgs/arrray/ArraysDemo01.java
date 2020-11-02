package com.bgs.arrray;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.sun.org.apache.bcel.internal.generic.Type;

import java.util.Arrays;

/**
 * @ClassName: ArraysDemo01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/12 16:18
 * @Version: v1.0
 */
public class ArraysDemo01 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 4};
        String s = Arrays.toString(arr);
        System.out.println(s);
        System.out.println(s.length());
    }
}
