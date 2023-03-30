// import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Square square = new Square(10);
        double squareArea = square.area();
        double squarePerimeter = square.perimeter();
        System.out.println("The area of the square is: " + squareArea);
        System.out.println("The perimeter of the square is: " + squarePerimeter);

    }
}
