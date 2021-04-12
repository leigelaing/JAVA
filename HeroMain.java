package com.demo1;

public class HeroMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero1 = new Hero();
        //为英雄起一个名字，设置年龄
        hero1.setName("门一博");
        hero1.setAge(42);
        System.out.println(hero1.getName());
        System.out.println(hero1.getAge());
        //创建一个武器的名字
        Weapon weapon = new Weapon("大刀");

        //为英雄配备武器
        hero1.setWeapon(weapon);
        //英雄出击
        hero1.attack();
    }
}
