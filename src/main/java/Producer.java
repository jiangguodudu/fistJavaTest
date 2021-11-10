import java.util.Random;

public class Producer extends Thread {

    private Factory factory;
    public Producer(Factory factory) {
        this.factory = factory;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            int n = rand.nextInt(1000);
            factory.produce(n);
        }
    }
}
