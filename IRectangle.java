public class IRectangle extends Shape {
    double length;
    double width;
    String position;

    public IRectangle(double length, double width, String position){
        super(position);
        this.length = length;
        this.width = width;
        this.position = position;
    }

    public IRectangle(double length, double width){
        super(null);
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

      // says if shape has position
      public String containsPosition() {
        if(this.position == null){
            return "shape has no position";
        }
        
        return "position of shape is " + this.position;
    }

}
