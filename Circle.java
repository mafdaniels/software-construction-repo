public class Circle extends Shape{
    // fields
    // String position = setLocation(position.Center);
    
    double radius;
    public static final double PI = 3.142;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setDiameter(double radius){
        this.radius = radius;
    }

    public double area(){
        return PI*radius*radius;
    } 

    public double perimeter(){
        return 2*PI*radius;
    }
}
