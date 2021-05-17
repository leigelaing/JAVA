package com.test01;

import java.util.Scanner;

/*
题目：键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母，小写字母，数字，其他。
思路：

 */
public class Demo09StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        int countUpper = 0;//大写字母
        int countLower = 0;//小写字母
        int countnumber = 0;//数字
        int countother = 0;//其他字符
        char[] chars = input.toCharArray();
       //遍历数组
        for (int i = 0; i < chars.length; i++) {
             char ch = chars[i];//当前单个字符
            if('A'<=ch && ch<='Z'){
                countUpper++;
            }
            else if('a'<=ch && ch<='z'){
                countLower++;
            }
            else if('0'<=ch && ch<='9'){
                countnumber++;
            }
            else{
                countother++;
            }
        }
        System.out.println("大写"+countUpper);
        System.out.println("小写"+countLower);
        System.out.println("数字"+countnumber);
        System.out.println("其他"+countother);
    }
}
