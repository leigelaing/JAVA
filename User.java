package com.test03;

public class User<show> {
    private String name;//姓名
    private int money;//余额

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //展示一下当前用户有多少余额
    public void show(){
        System.out.println("我叫"+name+"我有多少钱"+money);
    }

}
