import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food bill: ");
        double b = sc.nextDouble(); // base bill
      
        double g = b * 0.025; // GST
        double m = b * 0.030; // Maintenance
        double t = b + g + m; // total before discount

        double d; // discount
        if (b > 1000) {
            d = t * 0.10;
        } else {
            d = t * 0.05;
        }

        double f = t - d; // final bill

        System.out.println("Food Bill: " + b);
        System.out.println("GST: " + g);
        System.out.println("Maintenance: " + m);
        System.out.println("Total Before Discount: " + t);
        System.out.println("Discount: " + d);
        System.out.println("Final Bill: " + f);
    }
}
