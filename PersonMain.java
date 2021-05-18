package com.demo01;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("雷葛亮",25);
        System.out.println(person);//直接打印对象名称就是调用toString 方法。
        String s = person.toString();
        System.out.println(s);

    }
}
