package com.test01;

import com.test02.Student;

import java.util.ArrayList;
import java.util.Random;
/*
  题目：自定义4个学生类，添加到集合中去，并遍历
 */
public class Demo04Arraylist {
    public static void main(String[] args) {
       //1.自定义4个学生对象，添加到集合中，并遍历。
       //2.创建一个集合，用来存储学生对象。<Student>
       ArrayList<Student> list = new ArrayList<>();
       //3.根据类，创建4个学生对象
        Student one = new Student("一",10);
        Student two = new Student("二",20);
        Student three = new Student("三",30);
        Student four = new Student("四",40);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        //遍历集合：
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+","+student.getAge());

        }
    }
}
