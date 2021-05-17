package com.test01;
/*
题目：定义一个方法：把数组{1,2,3}按照指定的格式拼接成一个字符串。格式参照如下：[word1@word2@word3]
 分析：

 */
public class Demo08StringPractise {
    public static void main(String[] args) {
     //写一个数组，内容为1,2,3
        int[] array = {1,2,3};
        String result = formArrayToString(array);
        System.out.println(result);
     //定义一个方法：将数组变为字符串
    }
    public static String formArrayToString(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                str += "word"+arr[i]+"]";
            }
            else{
                str +="word"+arr[i]+"@";//在原有的基础上拼接内容
            }
        }
       return str;
    }
}
