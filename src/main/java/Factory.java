import sun.lwawt.macosx.CSystemTray;

public class Factory {

    private int product;  // 产品
    private boolean empty;  // 判别库存

    Factory() {
        this.empty = true;  // 库存是空的
    }

    public synchronized void produce(int newProduct) {
        while (!this.empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        product = newProduct;
        System.out.println("生产： " + newProduct);
        empty = false;
        notify();  // 有库存通知可以消费
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public synchronized void consume() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        System.out.println("消费：" + product);
        notify();
        try {
            Thread.sleep(500);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
