//import java.util.Scanner;
//import java.util.*;
//import java.sql.*;
//import java.util.Date;
import com.myMath.Add;

import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.lang.Math.PI;
import java.net.*;

public class TestExtends {

    public static void main(String[] args) {
//        Dog dog = new Dog("rongrong");
//        dog.bark();
//        System.out.println(dog instanceof Animal);
//        System.out.println(dog instanceof Dog);

//        Circle circle = new Circle();
//        double area = circle.getArea(20.23);
//        System.out.println("circle's area is " + area);

//        String msg1 = "hello";
//        System.out.println(msg1.hashCode());
//        String msg2 = msg1;
//        System.out.println(msg2.hashCode());
//        String msg3 = new String("hello");
//        System.out.println(msg3.hashCode());
//
//        Animal animal = new Animal("doudou");
//        System.out.println(animal);

//        Rectangle rec = new Rectangle();
//        Shape rec = new Rectangle();
//        rec.draw();
//        System.out.println("the area of rectangle is " + rec.area());

//        Fly bird = new Bird();
//        bird.flying();
//        bird.action();

//        int x = 5;
//        Integer obj = new Integer(x);
//        System.out.println(obj.getClass());
//
//        Boolean bo = new Boolean("true");
//        System.out.println(bo);
//
//        Integer y = 10;  // 自动封箱
//        y = y + 10;  // 拆箱
//        System.out.println("y = " + y);

//        Integer x = Integer.valueOf(2);
//        Integer y = Integer.valueOf("22");
//        Integer z = Integer.valueOf("1011", 2);
//        Integer t = Integer.valueOf("18a", 16);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//        System.out.println("z = " + z);
//        System.out.println("t = " + t);

//        System.out.println(Byte.SIZE);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);

//        Integer a = 10;
//        Integer b = 20;
//        Integer c = 10;
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a == c);

//        double r;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入圆的半径：");
//        r = sc.nextDouble();
//        System.out.println("圆的周长是：" + (2 * Math.PI * r));

//        Date date = new Date();

//        System.out.println(2 * PI);

//        Scanner sc = new Scanner(System.in);

//        Add add = new Add();
//        int x = add.calAdd(2, 3);
//        System.out.println(x);

//        System.out.println(myDiv(6, 2));
//        System.out.println(myDiv(8, 0));

//        int x;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入正整数：");
//        x = sc.nextInt();
//
//        for (int i=0; i < x; i++) {
//            for (int j = 0; j < x; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        String str1 = null;
//        System.out.println(str1.length());

//        int x1;
//        int x2;
//
//        Scanner sc = new Scanner(System.in);
//        x1 = sc.nextInt();
//        x2 = sc.nextInt();
//
//        try {
//            System.out.println(x1 / x2);
//        } catch (ArithmeticException e) {
//            System.out.println("除数不能为0" + e);
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
//        } catch (InputMismatchException e) {
//            System.out.println("请输入正整数" + e);
//        }

//        String[] pwdArr = {"1234", "123456789", "123456"};
//
//        for (int i = 0; i < pwdArr.length; i++) {
//            try {
//                pwdCheck(pwdArr[i]);
//            } catch (StringIndexOutOfBoundsException e) {
//                System.out.println("Error!" + e);
//                e.printStackTrace();
//            }
//        }

//        try {
//            myDiv(8, 0);
//        } catch (ArithmeticException e) {
//            System.out.println("Error " + e);
//        }

//        Thread thread = Thread.currentThread();
//        System.out.println("当前线程的名称：" + thread.getName());
//        thread.setName("myThread");
//        System.out.println("现在线程的名称：" + thread.getName());
//        System.out.println("目前线程的Id： " + thread.getId());

//        MultiThread mt = new MultiThread("horse");
//        mt.start();
//        System.out.println("当前线程的名字： " + mt.getName());

//        HorseRacing h1 = new HorseRacing("🐴1");
//        HorseRacing h2 = new HorseRacing("🐴2");
//        h1.start();
////        h2.start();
//
//        XPriority rabbit = new XPriority("Rabbit");
//        XPriority turtle = new XPriority("Turtle");
//        XPriority horse = new XPriority("Horse");
//        System.out.println(rabbit.getName() + "优先级是 " + rabbit.getPriority());
//        System.out.println(turtle.getName() + "优先级是 " + turtle.getPriority());
//        System.out.println(horse.getName() + "优先级是 " + horse.getPriority());
//
//        rabbit.setPriority(Thread.NORM_PRIORITY);
//        turtle.setPriority(Thread.MIN_PRIORITY);
//        horse.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(rabbit.getName() + "优先级是 " + rabbit.getPriority());
//        System.out.println(turtle.getName() + "优先级是 " + turtle.getPriority());
//        System.out.println(horse.getName() + "优先级是 " + horse.getPriority());
//
//        rabbit.start();
//        turtle.start();
//        horse.start();

//        Factory factory = new Factory();
//        Producer p = new Producer(factory);
//        Consumer c = new Consumer(factory);
//        System.out.println("同时按ctrl+c可中断程序");
//        p.start();
//        c.start();
//        try {
//            FileOutputStream out = new FileOutputStream("./ch1.txt");
//            String str1 = "南京审计大学Nanjing Audit university欢迎您。";
//            byte[] btArr = str1.getBytes();
//            out.write(btArr);
//            out.close();
//            System.out.println("输出成功！");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
////            FileInputStream in = new FileInputStream("./ch1.txt");
////            int b = in.read();
////            while ((b = in.read()) != -1) {
////                System.out.println((char) b);
////            }
////            in.close();
//            FileReader fr = new FileReader("./ch12.txt");
//            FileWriter fw = new FileWriter("./ch13.txt");
////            String str2 = "南京审计大学 Nanjing Audit university.";
//
//            int b;
//            while ((b = fr.read()) != -1) {
//                char ch = (char) b;
//                fw.write(ch);
//            }
//            fr.close();
//            fw.close();
//
//
//            System.out.println("输入成功");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File f = new File("./ch1.txt");
//        System.out.println(f.exists());
//        System.out.println(f.getName());
//        System.out.println(f.getParent());
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.isDirectory());
//        System.out.println(f.canRead());
//        System.out.println(f.canWrite());

//        MyData<Integer> myData = new MyData<>();
//        myData.setObj(10);
//        System.out.println(myData.getObj());
//
//        System.out.println("----------------");
//
//        MyData<String> myData1 = new MyData<>();
//        myData1.setObj("haha");
//        System.out.println(myData1.getObj());
//
//        Integer[] intArray = {5, 10, 15, 20, 25};
//        outputArray(intArray);
//
//        String[] strArray = {"NAU", "NU", "NAUU"};
//        outputArray(strArray);

//        ArrayList arrayList = new ArrayList();

//        ArrayList<String> list = new ArrayList<>();
//        list.add("南京");
//        list.add("上海");
//        list.add("北京");
//
//        for (String l:list) {
//            System.out.println(l);
//        }

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("安徽");
//        list2.add("山西");
//        list2.add("徐州");
//        list.addAll(list2);
//        System.out.println("list: " + list);
//
//        System.out.println(list.size());
//        System.out.println("lsit[2]: " + list.get(1));


//        HashMap<Integer, String> hm = new HashMap<>();
//        hm.put(101, "南京审计大学");
//        hm.put(100, "南京大学");
//        hm.put(102, "东南大学");
//        System.out.println("HashMap的内容：" + hm);
//        System.out.println("hashmap的大小：" + hm.size());
//        System.out.println(hm.get(101));
//
//        for (Map.Entry m:hm.entrySet()) {
//            System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
//        }

//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i=1; i <=10; i++) {
//            list.add(i);
//        }
//        System.out.println("shuffle前list的元素：" + list);
//
//        for (int i=1; i<=5; i++) {
//            Collections.shuffle(list);
//            System.out.println("shuffle后list元素：" + list);
//        }

//        StringAdd<String> obj = new StringAdd<String>() {
//            @Override
//            String display(String x, String y) {
//                return x + y;
//            }
//        };

//        System.out.println(obj.display("Java", "王者归来"));
//
//        Hi obj1 = (name) -> {
//            return "Hi " + name;
//        };
//        System.out.println(obj1.talking("jack"));
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("安徽");
//        list2.add("山西");
//        list2.add("徐州");
//
//        list2.forEach(info -> System.out.println(info));

//        List<String> list3 = List.of("北京", "上海", "南京");

//        Frame frm = new Frame("我的第一个AWT窗口程序");
//        frm.setSize(200, 150);
//        frm.setVisible(true);
//        try {
//            InetAddress ip = InetAddress.getLocalHost();
//            System.out.println(ip);
//            System.out.println(ip.getHostName());
//            System.out.println(ip.getHostAddress());
//        }catch (UnknownHostException e) {
//            System.out.println(e);
//        }

        try {
            URL url = new URL("https://www.24ht.com.tw/trabel.jpg");
            System.out.println("URL 是 " + url.toString());
            System.out.println("protocol 是 " + url.getProtocol());
            System.out.println("authority 是 " + url.getAuthority());
            System.out.println(url.getFile());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }




























    }

    public static int myDiv(int x, int y) throws ArithmeticException {
        return x / y;
    }

//    public static void pwdCheck(String pwd) {
//        if (pwd.length() >= 5 && pwd.length() <= 8) {
//            System.out.println("密码输入正确" + pwd);
//        } else {
//            System.out.println("密码内容失败" + pwd);
//            throw new StringIndexOutOfBoundsException("密码长度不对");
//        }
//    }

    public static <E> void outputArray(E[] elements) {
        for (E element: elements) {
            System.out.println(element);;
        }
    }
}
