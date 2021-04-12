package com.demo3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    /*
       直接地址值是没有意义的，需要重写Object类中的toString()方法。
       打印对象的属性（name ,age）
     */
    /*
    @Override
    public String toString(){
        //return "abc";
        return "person{name ="+name+",age = "+ age+"}";
    }
    */
/*
    @Override
    public String toString() {
       return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
               '}';
    }
    */


    /*
      Object类的equals方法，默认比较的是两个对象的地址值，没有意义。
      所以我们要重写equals方法，比较两个对象的属性。（name,age）
      问题：
        隐含一个多态
        多态的弊端：无法使用子类特有的内容（内容包括：属性与方法）；
         原来方法中参数类型为Object类型，使用方法传入的是p2 p2 = new Person("呵呵",20);
         父类指向子类对象，这就是多态
        Object obj = p2 = new Person("呵呵",20);
        解决方案：
        1.使用向下转型（强转）把Obj变为Person类型
     */
//    @Override
//    public boolean equals(Object obj){
//        // 增加一个判断，传递参数obj如果是this，直接返回的是true,提高效率
//       if(obj == this){
//           return true;
//       }
//       // 增加一个判断，传递参数obj如果是null，直接返回的是false,提高效率
//        if(obj == null){
//            return false;
//        }
//        //增加一个判断，防止类型装换异常，ClassCastException
//       if(obj instanceof Person){
//           //使用向下转型把Obj变为Person类型。
//           Person p = (Person)obj;
//           //比较两个对象的属性：一个对象是this（p1），另一个是（obj——>p2）
//           boolean b = this.name.equals(p.name) && this.age == p.age;
//           return b;
//       }
//       //不是Person类型返回false
//       return false;
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // getClass() != o.getClass()使用反射技术判断obj是否是Person类型
        //等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }
    public Person(String name, int age) {
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
}
