import java.util.Scanner;
public class phuongtrinh_bac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A: ");
        double a = sc.nextDouble(); 

        System.out.println("B: ");
        double b = sc.nextDouble(); 

        System.out.println("C: ");
        double c = sc.nextDouble(); 

        double value1 = 0;
        double value2 = 0;
        double delta = b*b-4*a*c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        }
        if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: ");
        }
        value1 = -b/(2*a);
        value2 = -b/(2*a);

        if (delta > 0) {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            value1 = (-b+Math.sqrt(delta)) / (2*a);
            value1 = (-b-Math.sqrt(delta)) / (2*a);
        }

        System.out.println("Nghiem cua phuong trinh bac 2: ");
        System.out.println("Nghiem thu nhat: " + value1);
        System.out.println("Nghiem thu hai: " + value2);
    }
}

