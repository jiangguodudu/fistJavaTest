public class Consumer  extends Thread {

    private Factory factory;

    public Consumer(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        int data;
        while (true) {
            factory.consume();
        }
    }
}
