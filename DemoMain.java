package com.demo2;

public class DemoMain {
    public static void main(String[] args) {
        //设置英雄
        Hero hero = new Hero();
        hero.setName("雷葛亮");
        //设置技能
     //   hero.setSkill(new SkillImpl());//使用单独定义的实现类进行设置


        //还可以改用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("门一博是我儿子");
            }
        };
        hero.setSkill(skill);
        //进一步简化，同时使用匿名内部类和匿名对象
         hero.setSkill(new Skill() {
             @Override
             public void use() {
                 System.out.println("门一博日你先人");
             }
         });

        hero.attack();
    }
}
