package com.role.property;

public class Item {

    String name;  // 物品名称
    int price;  // 价格

    public void buy() {
        System.out.println("购买");
    }

    public void effect() {
        System.out.println("使用物品后，可以有效果");
    }
}
