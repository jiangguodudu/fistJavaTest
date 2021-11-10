package com.role.charactor;

public class APHero extends Hero implements AP{

    @Override
    public void magicAttack() {
        System.out.println("进行了物理攻击");
    }
}
