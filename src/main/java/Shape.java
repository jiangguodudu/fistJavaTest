public abstract class Shape {

    Shape(){
        System.out.println("可以绘制图形了");
    }

    public void draw(){}

    public abstract double area();
}
