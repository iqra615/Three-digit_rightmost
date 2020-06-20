package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Input First Digit:");
        int a = io.nextInt();

        System.out.println("Input Second Digit:");
        int b = io.nextInt();

        System.out.println("Input Third Digit:");
        int c = io.nextInt();
        System.out.println("The result is: "+test_last_digit(a , b , c, true));
    }
    public static boolean test_last_digit(int p, int q, int r, boolean xyz)
    {
        return ( p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r% 10);
    }
}
