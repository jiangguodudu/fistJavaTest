public class Hero {

    private String name;  // 名字
    private float hp;  // 血量
    private float armor; // 护甲
    private int moveSpeed; // 移动速度

    // 坑队友
    void keng(){
        System.out.println("坑队友！");
    }

    // 获取护甲值
    float getArmor(){
        return armor;
    }

    // 添加速度
    public int addSpeed(int speed){
        moveSpeed += speed;
        return moveSpeed;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 683.63f;
        garen.armor = 27.536f;
        garen.moveSpeed = 25;

        int moveSpeed = garen.addSpeed(5);
        System.out.println("盖伦当前的移动速度是：" + moveSpeed);

        char c = 'A';
        short s = 80;
        c = (char) s;
        System.out.println(c);

        int i = 10;
        long l = 10L;
        l = i;


    }
}
