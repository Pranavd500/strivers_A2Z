import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int x;
        Scanner oddeven = new Scanner(System.in);
        System.out.println("enter the number:");
        x = oddeven.nextInt();
        if (x % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }

    }

}
