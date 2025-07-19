import java.util.*;

class Prog2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Division Part
            System.out.print("Enter Dividend: ");
            float a = sc.nextFloat();
            System.out.print("Enter Divisor: ");
            float b = sc.nextFloat();

            if (b == 0) {
                System.out.println("Number can't be divided by 0");
            } else {
                double ans = a / b;
                System.out.println("Answer is: " + ans);
            }

            // Array Access Part
            System.out.print("Enter the index to be accessed: ");
            int n = sc.nextInt();
            int[] arr = {1, 2, 3, 4, 5};

            try {
                System.out.println("Element at index " + n + " is: " + arr[n]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index must be within array bounds.");
            }
        }
    }
}
