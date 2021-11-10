import java.util.Scanner;


public class HelloWorld {

    public void method1(){
        final int j;
        j = 10;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

//        byte b1 = 8;
////        byte b2 = 300;
//        int i1 = 10;
//        int i2 = 200;
//
//        i1 = (byte) i1;
//        System.out.println("i1的值是：" + i1);
//        i2 = (byte) i2;
//        System.out.println("i2的值是：" + i2);
//        System.out.println(Integer.toBinaryString(200));
//        System.out.println(Integer.toBinaryString(i2));


        int i = 2;
        System.out.println(i == 1 & i++ == 2);
        System.out.println(i);
        int j = 3;
        int k = i < j ? 88 : 99;
        System.out.println(k);

//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//        float f = s.nextFloat();
//        String str = s.nextLine();
//
//        System.out.println("第一个整数是：" + x);
//        System.out.println("第一个浮点数是：" + f);
//        System.out.println("第一个字符是：" + str);


        System.out.printf("Byte的范围是：%d~%d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);

        int a = 200;
        byte b = (byte) a;
        System.out.println(b);

        System.out.println("100的二进制是：" + Integer.toBinaryString(100));
        System.out.println("100的十六进制是：" + Integer.toHexString(100));


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
//        int age = sc.nextInt();
//
//        if (age < 18){
//            System.out.println("您太小了！");
//            System.out.println("不可以上网哦！");
//        }

//        while (!sc.hasNextInt()){
//            System.out.println("输入的不是整数");
//            sc.nextInt();
//        }

        int[] numList = {5, 10, 15, 20, 25, 30};
        for (int num:numList){
            System.out.println(num);
        }
    }
}
