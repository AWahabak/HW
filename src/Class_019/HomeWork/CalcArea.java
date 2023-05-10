package Class_019.HomeWork;
/* HW01
    Create 1 class in which
        create methods that will calculate the area of Rectangle and Square
        Methods name must be called calculateArea
        Use separate class to test your code
 */
public class CalcArea {
    //Rectangle area = width * length (A=wl)
    static void calculateArea(int width, int length){
        int rectangleArea = width * length;
        System.out.println("The area of rectangle is "+rectangleArea);
    }

    //Square area = side * side (A=s*s) (whereas both s are equal that is why only one parameter is provided as one side)
    static void calculateArea(int side){
        int squareArea = side * side;
        System.out.println("The area of square is "+squareArea);
    }
}
