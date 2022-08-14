import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int x = 0, y = 0, x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            x3 = scan.nextInt();
            y3 = scan.nextInt();
        }
        for (int i = 0; i < N; i++)
        {
            if (isParal(x, y, x1, y1, x2, y2, x3, y3)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean isParal(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double a1 = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        double a2 = Math.sqrt(Math.pow(x - x3, 2) + Math.pow(y - y3, 2));
        double a3 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double a4 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));

        double k1 = (x - x1)/(y - y1);
        double k2 = (x - x3)/(y - y3);
        double k3 = (x1 - x2)/(y1 - y2);
        double k4 = (x2 - x3)/(y2 - y3);

        if ((a1 == a4 && k1 == k4) || (a2 == a3 && k2 == k3))
        {
            return true;
        } else return false;
    }
}