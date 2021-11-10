public class Rectangle extends Shape{

    private double width;
    private double height;

    Rectangle(){
        System.out.println("可以绘制矩形了");
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("绘制矩形");
    }

    @Override
    public double area(){
        return width * height;
    }
}
