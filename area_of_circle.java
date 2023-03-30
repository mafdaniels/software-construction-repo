import java.util.Scanner;
public class area_of_circle {


    public static void main(String args[])
    {
        int radius;
        double area;
        double perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        radius = sc.nextInt();
        area = (radius*radius)*Math.PI;
        System.out.println("area of the circle is"+area);
        perimeter = 2* Math.PI*(2*radius);
        System.out.println("perimeter of the circle is"+perimeter);

    }
}
