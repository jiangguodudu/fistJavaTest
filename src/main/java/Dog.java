public class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("狗叫是汪汪汪！");
    }
}
