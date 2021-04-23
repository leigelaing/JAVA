package com.demo01;

import java.io.File;

/*
     练习—递归打印多级目录:意思就是打印每一层文件夹中的内容
 */
public class Demo08diguilainxi3 {
    public static void main(String[] args) {
        File f1 = new File("F:\\临时学习\\aaa");
        getAllFile(f1);
    }
    /*
      定义一个方法，参数传递File类型的目录
       方法中对目录进行遍历
     */
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                System.out.println(f);
            }
        }

    }
}
