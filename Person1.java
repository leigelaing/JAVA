package com.demo01;
public class Person1 implements Comparable<Person1>{
    private String name;
    private  int age;
    public Person1() {
    }
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Person1 o) {
        //return 0;//认为元素都是相同的
       //自定义比较的规则，比较两个人的年龄（this，参数Person1）
       // return this.getAge() - o.getAge();//按照年龄升序排序
        return o.getAge() - this.getAge();//按照年龄降序排序
    }
}
