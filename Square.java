public class Square extends Shape{
    // fields
    double side;

    // constructor
    public Square(double side) {
        this.side = side;
    }	 	 

    // retrieves the side
    public double getSide() { 
        return this.side;
    }

    // sets the side
    public void setSide(double side){
        this.side = side;
    }

    // calculates and returns area of the square
    public double area(){
        double area = side * side;
        return area;
    }

    // calcultes and returns perimeter of the square
    public double perimeter(){
        double perimeter = side + side + side + side;
        return perimeter;
    }

    // Scanner console = new Scanner(System.in);
        
    // System.out.print("Enter side of the square: ");
    // double squareSide = console.nextDouble();
    // Square square = new Square(squareSide);
    // double squareArea = square.area();
    // System.out.println("The area of square is " + squareArea);
    
}