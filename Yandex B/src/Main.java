import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = scan.nextInt();
        int j = scan.nextInt();

        if (i > j)
        {
            int c;
            c = i;
            i = j;
            j = c;
        }
        int min = Math.min(N - j + i -1, j - i - 1);
        System.out.println(min);
    }
}