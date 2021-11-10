import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class SmallMath {

    int a;
    int b;

    SmallMath(int x, int y){
        a = x;
        b = y;
    }

    void add(){
        System.out.println("两数相加和是：" + (a + b));
    }

    void mul(){
        System.out.println("两数相乘积是：" + (a * b));
    }

    public static void main(String[] args) {
//        SmallMath sm = new SmallMath(2, 3);
//        sm.add();
//
//        System.out.println("E = " + Math.E);
//        System.out.println("PI = " + Math.PI);
//
//        double rd = Math.random();
//        System.out.printf("rd = %5.2f", rd);

//        int z = (int) (Math.random() * 6 + 1);
//        System.out.println(z);
//
//        Random rd = new Random();
//        System.out.printf("%d \t", rd.nextInt(100));

//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//        System.out.println(date.getYear());
//        System.out.println(date.getDate());
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        System.out.println(ld.getYear());
//        System.out.println(ld.getDayOfMonth());
//
//        Calendar cl = Calendar.getInstance();
//        System.out.println(cl.getTime());

//        char ch1 = 'A';
//        char ch2 = '1';
//
//        System.out.println(Character.isDigit(ch1));
//        System.out.println(Character.isDigit(ch2));
//        System.out.println(Character.isUpperCase(ch1));
//        System.out.println(Character.toLowerCase(ch1));

        char[] ch1 = {'南', '京', '审', '计', '大', '学'};
        char[] ch2 = {'A', 'u', 'd', 'i', 't', '-', 's', 'c', 'h', 'o', 'o', 'l'};

        String str1 = new String();
        String str2 = new String(ch1);
        String str3 = new String(ch2);
        String str4 = new String(ch2, 2, 4);
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);

//        System.out.println(str3.length());
//        System.out.println(str1.isEmpty());
//        System.out.println(str3.toUpperCase());

        System.out.println();

//        System.out.println(str3.indexOf('u'));
//        System.out.println(str3.indexOf('t', 3));
//        System.out.println();
//        System.out.println(str3.lastIndexOf('c'));
//        System.out.println(str3.lastIndexOf('c', 6));
//
//        System.out.println();
//
//        System.out.println(str3.charAt(3));
//
//        System.out.println();
//
//        char[] ch = str3.toCharArray();
//        for (char c:ch){
//            System.out.println(c);
//        }

//        String str5 = new String("南京审计大学");
//        StringBuffer bsuf = new StringBuffer(str5);
//        System.out.println(bsuf);

        String str = new String("9");

        String pattern = "\\d";
        if (str.matches(pattern)){
            System.out.println("TRUE" + str.matches(pattern));
        }

        String str6 = "Hello! java, I love java";
        String pattern1 = "java";
        System.out.println(str6.replaceFirst(pattern1, "Python"));




















    }
}
