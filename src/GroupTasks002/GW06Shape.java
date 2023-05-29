package GroupTasks002;
/*
6.Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */
public interface GW06Shape {
    void calcArea();
    void calcPerimeter();
}
class Circle implements GW06Shape{
    double radius=3.5;
    @Override
    public void calcArea(){
        System.out.println("Area of circle is: "+Math.PI*radius*radius);
    }
    @Override
    public void calcPerimeter(){
        System.out.println("Perimeter of circle is: "+2*Math.PI*radius);
    }
}
class Square implements GW06Shape{
    int sides=5;
    @Override
    public void calcArea(){
        System.out.println("Area of squar is"+sides*sides);
    }
    @Override
    public void calcPerimeter(){
        System.out.println("Perimeter of square is: "+sides*4);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.calcArea();
        c1.calcPerimeter();

        Square s1 = new Square();
        s1.calcArea();
        s1.calcPerimeter();

    }
}