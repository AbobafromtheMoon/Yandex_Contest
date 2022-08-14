import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < N - 1; i++)
        {
            sum = sum + Math.max(A[i + 1] - A[i], 0);
        }
        System.out.println(sum);
    }
}