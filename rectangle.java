import java.util.Scanner;

public class rectangle {
    public static void main(String[] args)
    {
        int length, width, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        length = s.nextInt();
        System.out.print("Enter width of rectangle:");
        width = s.nextInt();
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = length * width;
        System.out.println("Area of rectangle:"+area);
    }
}
