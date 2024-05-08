
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle is printed");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle is printed");
    }
}
public class Student {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape  rectangle = new Rectangle();
        rectangle.draw();
    }
}