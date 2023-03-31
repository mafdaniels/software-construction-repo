public class Circle extends Shape{
    // fields
    double radius;
    public static final double PI = 3.142;
    String position;

    public Circle(double radius, String position){
        super(position);
        this.radius = radius;
        this.position = position;
    }

    public Circle(double radius){
        super(null);
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

    // says if shape has position
    public String containsPosition() {
        if(this.position == null){
            return "shape has no position";
        }
        
        return "position of shape is " + this.position;
    }
}
