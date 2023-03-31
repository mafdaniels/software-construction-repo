// import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        // creates an instance of class square
        // an object of type square
        // Shape shape = new Shape("center");
        // String shapeLocation = shape.containsPosition();
        // System.out.println(shapeLocation);
        // System.out.println();

        // Shape square = new Square(10, "center");
        // double areaOfSquare = square.area();
        // double perimeterOfSquare = square.perimeter();
        // System.out.printf("the area of the square is: %.2f\n", areaOfSquare);
        // System.out.printf("the perimeter of the square is: %.2f\n\n", perimeterOfSquare);
        // String squareLocation = square.containsPosition();
        // System.out.println("the position of the shape is \n" + squareLocation);

        // creates an object of type rectangle
        // Shape rectangle = new IRectangle(10, 2, "center");
        // double areaOfRectangle = rectangle.area();
        // double perimeterOfRectangle = rectangle.perimeter();
        // System.out.printf("the area of the rectangle is: %.2f\n", areaOfRectangle);
        // System.out.printf("the perimeter of the rectangle is: %.2f\n\n", perimeterOfRectangle);
        // String rectangleLocation = rectangle.containsPosition();
        // System.out.println(rectangleLocation);
        // System.out.println();
        
        System.out.println();
        // creates an instance of class circle
        // an object of type circle
        Shape circle = new Circle(7, "center");
        double areaOfCircle = circle.perimeter();
        double perimeterOfCircle = circle.perimeter();
        System.out.printf("the area of the circle is: %.2f\n", areaOfCircle);
        System.out.printf("the perimeter of the circle is: %.2f\n\n", perimeterOfCircle);
        String circleLocation = circle.containsPosition();
        System.out.println(circleLocation);
        System.out.println();

    }

}
