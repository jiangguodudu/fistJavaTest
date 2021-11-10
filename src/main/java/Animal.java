public class Animal extends Object{

    private String name;

    Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + " is eating.");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping.");
    }

    public void bark(){
        System.out.println(this.name + " is barking.");
    }

    @Override
    public String toString(){
        return "My name is " + this.name;
    }
}
