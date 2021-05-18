package com.demo01;

public class GameMain {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.setName("aaa");
        hero1.setAge(15);
        Weapon weapon = new Weapon();
        weapon.setCode("搅屎棍");
        hero1.setWeapon(weapon);
       hero1.attack();


        Weapon weapon1 = new Weapon("儿子");
        Hero hero2 = new Hero("bbb",20,weapon1);
        hero2.attack();

    }
}
