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
        return (long) (a / getGCD(a, b)) * b;
    }
    private static int getGCD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }
}
