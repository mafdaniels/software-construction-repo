public class Square {
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

    // calculates area
    public double area(double side){
        double area = side * side;
        return area;
    }
    
}