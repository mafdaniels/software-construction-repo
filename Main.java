// import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // creates an instance of class square
        // an object of type square
        Square square = new Square(10);  
        double areaOfSquare = square.area();
        double perimeterOfSquare = square.perimeter();
        System.out.printf("the area of the square is: %.2f\n", areaOfSquare);
        System.out.printf("the perimeter of the square is: %.2f\n\n", perimeterOfSquare);

        // creates an instance of class rectangle
        // an object of type rectangle
        IRectangle rectangle = new IRectangle(10, 2);
        double areaOfRectangle = rectangle.area();
        double perimeterOfRectangle = rectangle.perimeter();
        System.out.printf("the area of the rectangle is: %.2f\n", areaOfRectangle);
        System.out.printf("the perimeter of the rectangle is: %.2f\n\n", perimeterOfRectangle);
        
        // creates an instance of class circle
        // an object of type circle
        Circle circle = new Circle(5);
        double areaOfCircle = circle.perimeter();
        double perimeterOfCircle = circle.perimeter();
        System.out.printf("the area of the circle is: %.2f\n", areaOfCircle);
        System.out.printf("the perimeter of the circle is: %.2f\n\n", perimeterOfCircle);

    }
}
