public class HorseRacing extends Thread {

    private String name;

    HorseRacing(String name) {
        super(name);
    }

    public void run() {
        for (int i=0; i <= 1000; i++) {
            System.out.println(getName() + "正在跑第 " + i + "圈");
        }
    }
}
