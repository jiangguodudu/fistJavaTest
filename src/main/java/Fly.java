public interface Fly {

    void flying();

    default void action(){
        System.out.println("我会飞");
    }
}
