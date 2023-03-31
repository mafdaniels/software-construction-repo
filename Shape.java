import java.awt.*;

public class Shape {
    String position;

    public Shape(String position){
        this.position = position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String containsPosition() {
        if(this.position == null){
            return "shape has no position";
        }
        
        return "position of shape is " + this.position;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

}
