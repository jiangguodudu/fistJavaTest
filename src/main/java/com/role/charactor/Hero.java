package com.role.charactor;

import com.role.property.Item;
import com.role.property.Weapon;

public class Hero {

    public String name;  // 姓名
    protected float hp;  // 血量
    float armor;  // 护甲
    int moveSpeed;  // 移动速度
    static String copyright;  // 类属性，静态属性
    float maxHP;

    // 物品栏的容量
    public static int itemCapacity = 8;  // 声明的时候初始化

    // 方法名和类名一样
    // 没有返回类型
    public Hero() {
        this.name = "one hero";
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public Hero(String heroName) {
        this.name = heroName;
        System.out.println("Hero的有参构造方法");
    }

    public Hero(String heroName, float heroHp) {
        this.name = heroName;
        this.hp = heroHp;
    }
//
//    public void setName1(String name) {
//        name = name;
//    }
//
//    public void setName2(String heroName) {
//        name = heroName;
//    }
//
//    public void setName3 (String heroName2) {
//        this.name = heroName2;
//    }

    // 回血
    public void huixue (int xp) {
        hp = hp + xp;
        xp = 0;  // 回血完毕后，血瓶=0
    }

    // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero hero, int damage) {
        hero.hp = hero.hp - damage;
    }

    // 复活
    public void revive(Hero h) {
        h = new Hero(this.name, 383);
    }

    // 武装一把武器
    public void equip(Weapon w) {

    }

    public void useItem(Item i) {
        i.effect();
    }

    // 类方法，静态方法
    // 通过类就可以直接调用
    public static void battleWin() {
        System.out.println("battle win");
    }

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore {
        int kill;
        int die;
        int assit;

        public void legendary() {
            if (kill >= 8) {
                System.out.println(name + "超神");
            } else {
                System.out.println(name + "尚未超神");
            }
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";

        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础上
        Hero.BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
}
