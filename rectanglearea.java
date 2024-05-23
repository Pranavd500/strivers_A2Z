import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        int x, y, z;
        Scanner area = new Scanner(System.in);
        System.out.println("enter the width of rectangle:");
        x = area.nextInt();
        System.out.println("enter the breadth:");
        y = area.nextInt();
        System.out.println("the area of rectangle is:");
        z = x * y;
        System.out.println(z);

    }

}
