import java.util.*;
public class P1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of copies Sold: ");
        int w = sc.nextInt();
        System.out.println("Enter the selling price");
        double x = sc.nextDouble();
        System.out.println("Enter the cost price");
        double y = sc.nextDouble();
        double profit = 100-(w*x-w*y);
        // profit = w(x-y)-100 can be used
        System.out.println("Profit is "+profit);
    }
}
