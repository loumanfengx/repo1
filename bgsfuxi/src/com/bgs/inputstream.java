package com.bgs;

import java.io.*;

/**
 * @ClassName: inputstream
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/9 10:41
 * @Version: v1.0
 */
public class inputstream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\upload\\1.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\1.jpg");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes);
            // 1,2,3,4……1023,1024
            //1,2,3,4……1023,1024
        }
        fos.close();
        fis.close();
    }
}
