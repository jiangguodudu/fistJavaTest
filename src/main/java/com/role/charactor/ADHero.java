package com.role.charactor;

import com.role.charactor.Hero;

public class ADHero extends Hero implements AD{

    public ADHero() {
        System.out.println("ADHero的构造方法");
    }

    public ADHero(String name) {
        super(name);
        System.out.println("ADHero的有参构造方法");
    }

    public void attack() {
        System.out.println(name + " 进行了一次攻击， 但是不确定打中谁了");
    }

    public void attack(Hero h1) {
        System.out.println(name + " 对" + h1.name + " 进行了一次攻击");
    }

    public void attack(Hero h1, Hero h2) {
        System.out.println(name + " 同时对 " + h1.name + " 和 " + h2.name + " 进行了攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    // 隐藏父类的battleWin方法
    public static void battleWin() {
        System.out.println("ad hero battle win");
    }
}
