import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int x;
        if (c == 0 && d == 0) System.out.println("Input c != 0 and d != 0");

        if (a == 0 && b == 0) System.out.println("INF");
        else if (a == 0 || b * c == a * d) System.out.println("NO");
        else if (b % a == 0)
        {
            x = -b/a;
            System.out.println(x);
        }
        else System.out.println("NO");
    }
}