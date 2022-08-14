import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x > 12 || y > 12 || x == y)
            System.out.println(1);
        else
            System.out.println(0);
    }
}