package com.demo6;

public class Body {   //外部类

    public class Heart{   //成员内部类
      //内部类的方法
        public void beat(){
            System.out.println("心脏跳动，砰砰");
            System.out.println("我叫"+name);//正确写法！
        }
    }
    //外部类的成员变量
    private String name;
    //外部类的方法
    public void methodbody(){
        System.out.println("外部类的方法！");
        //在外部类的方法当中使用内部类
        Heart heart = new Heart();
        heart.beat();
        //匿名对象：
        new Heart().beat();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
