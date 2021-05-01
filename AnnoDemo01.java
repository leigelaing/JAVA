package com.demo02;
/*
  1.在dos中写javadoc命令  后面加java源码文件
  2.打开index.htlm文件
 */
/**
 * 注解javadoc演示
 *
 * @author 雷葛亮
 * @version 1.0
 * @since 1.5
 */
public class AnnoDemo01 {
    /**
     * 两数的和
     * @param a 整数
     * @param b  整数
     * @return 两数的和
     */
    public static int add (int a,int b){
        return a + b;
    }
    public static void main(String[] args) {

    }
}
