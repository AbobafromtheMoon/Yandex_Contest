import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt(); //код завершения задачи
        int i = scan.nextInt(); //вердит интерактора
        int c = scan.nextInt(); //вердикт чекера
        int final_ = 0;

        switch(i)
        {
            case (0):
                if (r != 0)
                    final_ = 3;
                else
                    final_ = c;
                break;
            case(1):
                final_ = c;
                break;
            case(4):
                if (r != 0)
                    final_ = 3;
                else
                    final_ = 4;
                break;
            case(6):
                final_ = 0;
                break;
            case(7):
                final_ = 1;
                break;
            default:
                final_ = i;
                break;
        }
        System.out.println(final_);
    }
}