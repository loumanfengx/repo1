package com.bgs.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateDemo01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/10 17:08
 * @Version: v1.0
 */
public class DateDemo01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        
    }
}
