import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter the x value :");
        x = myobj.nextInt();
        System.out.println("enter y value:");
        y = myobj.nextInt();
        sum = x + y;
        System.out.println("the sum of two number is:" + sum);
    }
}