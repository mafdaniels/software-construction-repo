public class IRectangle {
    double length;
    double width;

    public IRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return length + width + length + width;
    }
}
