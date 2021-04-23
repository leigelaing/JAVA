package com.demo01;

import java.io.File;

/*
  File类遍历（文件夹）目录功能：
  public String[] list();  返回一个String数组，表示该File目录中的所有子文件或目录
  public File[] listFiles(); 返回File数组，表示该File目录中的所有子文件或目录
  注意事项：
  1.list方法与listFiles方法遍历的是构造方法中给出的目录
  2.如果构造方法中给出的路径不存在，会抛出空指针异常
  3.如果构造方法中给出的路径不是一个目录，也会抛出空指针异常。
  4.File类遍历，能遍历到隐藏的文件夹
 */
public class Demo04File {
    public static void main(String[] args) {
        show01();
        show02();
    }
     /*
     public String[] list();  返回一个String数组，表示该File目录中的所有子文件或目录
      遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个
      String类型的数组中。
     */
    private static void show01() {
       File f1 = new File("F:\\临时学习\\aaa\\bbb\\ccc");
       String[] arr = f1.list();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(String b:arr){
            System.out.println(b);
        }
    }
     /*
     public File[] listFiles(); 返回File数组，表示该File目录中的所有子文件或目录
     遍历构造方法中给出的目录，会获取目录中所有文件/文件夹的名称，把文件与文件夹封装为一个File对象
     多个File对象存储到File数组中
     */
    private static void show02() {
        File f1 = new File("F:\\临时学习\\aaa\\bbb\\ccc");
        File[] arr1 = f1.listFiles();
        for(File b1:arr1){
            System.out.println(b1);
        }
    }
}
