package com.demo2;

public class Hero {
    private String name;//姓名
    private  Skill skill;//技能

    public void attack(){
        System.out.println("我叫 "+name);
        skill.use();//调用接口中的抽象方法。
        System.out.println("释放技能完成");
    }
    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
