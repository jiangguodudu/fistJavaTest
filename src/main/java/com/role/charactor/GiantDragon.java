package com.role.charactor;

public class GiantDragon {

    // 私有化构造方法使得该类无法在外部通过new进行实例化
    private GiantDragon() {}

    // 准备一个类属性，指向一个实例化对象
    private static GiantDragon instance = new GiantDragon();

    public static GiantDragon getInstance() {
        return instance;
    }
}
