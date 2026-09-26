import java.util.Scanner;

public class GMR_GMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GMR & GMD Calculator");
        System.out.println("--------------------");

        System.out.print("Enter Conductor Radius (m): ");
        double r = sc.nextDouble();

        // GMR of a solid conductor
        double gmr = 0.7788 * r;

        System.out.print("Enter Distance D12 (m): ");
        double d12 = sc.nextDouble();

        System.out.print("Enter Distance D23 (m): ");
        double d23 = sc.nextDouble();

        System.out.print("Enter Distance D31 (m): ");
        double d31 = sc.nextDouble();

        // GMD for 3-phase line
        double gmd = Math.cbrt(d12 * d23 * d31);

        System.out.println("\nResults:");
        System.out.println("GMR = " + gmr + " m");
        System.out.println("GMD = " + gmd + " m");

        sc.close();
    }
}
