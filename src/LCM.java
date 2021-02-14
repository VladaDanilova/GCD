import java.util.Scanner;

/**
 * @author vladadanilova
 */
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getLCM(a, b));
    }

    private static long getLCM(int a, int b)
    {
        int num1, num2;
        long mult;
        if (a > b)
        {
            num1 = a;
            num2 = b;
        }
        else
        {
            num1 = b;
            num2 = a;
        }

        for (int i = 1; i < num2; i++)
        {
            mult = num1 * i;
            if (mult % num2 == 0)
            {
                return (long) mult;
            }
        }
        return (long) num1*num2;
    }
}
