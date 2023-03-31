import java.util.Scanner;

public class Shape {

    double length;
    double width;
    double radius;
    void contain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter_length:" + length);
        length = scanner.nextDouble();
        System.out.print("Enter_width:" + width);
        width = scanner.nextDouble();


        //name = scanner.next();
    }

    void Area() {
        double area1;
        area1 = length * width;
        System.out.println("area is:" +area1);
        //double area2;
        //area2 = length * length;
    }
    void Area2(){
        double area2;
        area2 = length* length;
        System.out.println("area is:" +area2);

    } void Area3(){
        double area3;
        area3 = 2*3.14* radius;
        System.out.println("area is:" +area3);}

    void perimeter() {
        double perimeter1;
        perimeter1 = 2 * (length + width);
        System.out.println("perimeter is:" +perimeter1);


    }
    void perimeter2(){
        double perimeter2;
        perimeter2 = 4 * (length);
        System.out.println("Perimeter of square is:" +perimeter2);
    }
    void perimeter3() {
        double perimeter3;
        perimeter3 = 2 * 3.14 * (2*radius);
        System.out.println("Perimeter is:" + perimeter3);
    }
}
class Use_shape{
    public static void main(String[] args) {
        String position = "center";
        int size = 4;
        Shape rect = new Shape();
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter_shape_name:" + name);
        name = scanner.nextLine();

        if (name.equals("rectangle")) {
            System.out.println("position is " + position +  "and size is" + size);
            rect.contain();
            rect.Area();
            rect.perimeter();
            //System.out.println("Area is :" + area1);
        } else if (name.equals("square")) {
            System.out.println("position is at:" + position);
            System.out.print("enter length:" + rect.length);
            rect.length  = scanner.nextDouble();
            rect.Area2();
            rect.perimeter2();
        }else if (name.equals("circle")){
            System.out.println("position is at:" + position);
            System.out.print("enter radius:" + rect.radius);
            rect.radius  = scanner.nextDouble();
            rect.Area3();
            rect.perimeter3();
        }else {
            System.out.println("TOKISUUSA, shape not found!!");

        }
    }
}
