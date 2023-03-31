public class Circle extends Shape{
    // fields
    public static final double PI = 3.142;
    double diameter;

    public Circle(double diameter){
        this.diameter = diameter;
    }

    public double getDiameter(){
        return this.diameter;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }

    public double area(){
        return PI*((1/2)*diameter)*((1/2)*diameter);
    } 

    public double perimeter(){
        return PI*diameter;
    }
}
