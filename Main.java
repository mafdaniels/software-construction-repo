// import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // square
        Square square = new Square(10);
        double areaOfSquare = square.area();
        double perimeterOfSquare = square.perimeter();
        System.out.printf("the area of the square is: %.3f\n", areaOfSquare);
        System.out.printf("the perimeter of the square is: %.3f\n", perimeterOfSquare);

        // rectangle
        // Rectangle rectanle = new Rectangle(10);
        // double areaOfRectangle = rectangle.area();
        // double perimeterOfRectangle = rectangle.perimeter();
        // System.out.printf("the area is: %.3f\n", areaOfRectangle);
        // System.out.printf("the perimeter is: %.3f\n", perimeterOfRectangle);
        
        // circle
        Circle circle = new Circle(5);
        double areaOfCircle = circle.perimeter();
        double perimeterOfCircle = circle.perimeter();
        System.out.printf("the area of the circle is: %.3f\n", areaOfCircle);
        System.out.printf("the perimeter of the circle is: %.3f\n", perimeterOfCircle);

    }
}
