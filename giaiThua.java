import java.util.Scanner;
// 3! = 3.2.1 = 6
public class giaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");
        int number = sc.nextInt();
        int result = 1;

        if (number <=0) {
            result = 1;
        } else {
            for (int i = 1; i <= number; i++) {
                result = result*i;
            }
        }
        System.out.println("Giai thua cua n: " + result);
    }
}