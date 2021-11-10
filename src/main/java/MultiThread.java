public class MultiThread extends Thread{

    MultiThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread 正在运行中......");
    }
}
