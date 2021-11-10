public class XPriority extends Thread {

    XPriority(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "正在运行 " + i);
        }
    }
}
