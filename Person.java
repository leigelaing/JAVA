package Demo02;

import java.io.Serializable;

/*
 序列化与反序列化的时候，会抛出NotSerializableException异常（没有序列化异常）
 类通过实现java.io.Serializable 接口以启用其序列化功能，未实现此接口的类将无法使其
 任何状态序列化或反序列化。
 Serializable接口也叫标记型接口
   要进行序列化与反序列化的类必须实现Serializable接口，就会给类添加一个标记。
   当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记。
   有：就可以序列化与反序列化
   没有：就会抛出NotSerializableException异常。
 */
public class Person implements Serializable {
    private String name ;
    private int age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
