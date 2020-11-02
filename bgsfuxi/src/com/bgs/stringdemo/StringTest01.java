package com.bgs.stringdemo;

/**
 * @ClassName: StringTest01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/8 15:44
 * @Version: v1.0
 */
public class StringTest01 {
    /*1. 编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕
	2.编写程序将String类型字符串”test” 变为 “tset”.
    3. 写一个方法判断一个字符串是否对称
	4. String s = "113@ ere qqq yyui"
    请输出所有子串
		113
    ere
            qqq
    yyui
	5. 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，“To be or not to be"，将变成"oT eb ro ton ot eb."。
    6.String s=”name=zhangsan age=18 classNo=090728”;将上面的字符串拆分，结果如下:zhangsan 18 090728*/

    /**
     * 3. 写一个方法判断一个字符串是否对称
     * @param str
     * @return
     */
    public static boolean checkString(String str) {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverseSb = sb.reverse();
        if (sb.equals(reverseSb)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //1. 编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子串”DK” 并输出到屏幕
        String s1 = "jdk";
        String sUp = s1.toUpperCase();
        System.out.println(sUp);
        String sSub = sUp.substring(1);
        System.out.println(sSub);
        //2.编写程序将String类型字符串”test” 变为 “tset”
        String s2 = "test";
        StringBuffer sb = new StringBuffer(s2);
        StringBuffer s2Reverse = sb.reverse();
        System.out.println(s2Reverse);
        String s3 = "te";
        //4. String s = "113@ ere qqq yyui"
        String s = "113@ ere qqq yyui";
        String[] s4 = s.split(" ");
        //5.编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，“To be or not to be"，将变成"oT eb ro ton ot eb."。
        String s5 = "To be or not to be";
        String[] s5Array = s5.split(" ");
        String sb1 = "";
        for (int i = 0; i < s5Array.length; i++) {
            if (i < s5Array.length - 1) {
                sb1 += new StringBuffer(s5Array[i]).reverse().toString() + " ";
            } else {
                sb1 += new StringBuffer(s5Array[i]).reverse().toString() + ".";
            }

        }
        System.out.println(sb1);
        System.out.println("------------");
        //6.String s=”name=zhangsan age=18 classNo=090728”;将上面的字符串拆分，结果如下:zhangsan 18 090728
        String s6 = "name=zhangsan age=18 classNo=090728";
        String s6Result = "";
        String[] s6Array = s6.split(" ");

        for (int i = 0; i < s6Array.length; i++) {
            if (i < s6Array.length - 1) {
                s6Result += s6Array[i].split("=")[1] + " ";
            } else {
                s6Result += s6Array[i].split("=")[1];
            }
        }
        System.out.println(s6Result);


    }

}
