public class Square extends Shape{
    // fields
    String position;
    double side;

    // constructor
    public Square(double side, String position) {
        super(position);
        this.side = side;
        this.position = position;
    }

    public Square(double side){
        super(null);
        this.side = side;
    }
    
    // sets the side
    public void setSide(double side){
        this.side = side;
    }

    // retrieves the side
    public double getSide() { 
        return this.side;
    }

    // sets the side
    public void setPosition(String position){
        this.position = position;
    }

    // says if shape has position
    public String containsPosition() {
        if(this.position == null){
            return "shape has no position";
        }
        
        return "position of shape is " + this.position;
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