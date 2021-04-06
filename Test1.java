package com.hehe;

public class Test1 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("门一博");
        stu1.setAge(1200);
        System.out.println("姓名"+stu1.getName()+",年龄"+stu1.getAge());
        System.out.println("=============================");
        Student stu2 = new Student("雷葛亮",15);
        System.out.println("姓名"+stu2.getName()+",年龄"+stu2.getAge());
        System.out.println("==============================");
        stu2.setAge(50);
        System.out.println("姓名"+stu2.getName()+",年龄"+stu2.getAge());
    }



}

    /*
    public static void main(String[] args) {

        This one = new This();
        //设置自己的名字
        one.name = "雷葛亮";
        one.sayHello("门一博");
        System.out.println("=========================");
        System.out.println(one);//地址值
    }
}
*/