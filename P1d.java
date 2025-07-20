import java.util.*;

public class P1d {
    public static void main(String[] args) {
        int pin = 1234;
        double balance = 10000;
        int[] notes = {500, 100};

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Your Card");
        System.out.print("Enter your card pin: ");
        int upin = sc.nextInt();

        if (pin == upin) {
            System.out.println("Welcome!");
            System.out.println("Enter 1 to view balance");
            System.out.println("Enter 2 to withdraw money");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.println("Your balance is ₹" + balance);
            } else if (op == 2) {
                System.out.print("Enter the amount to withdraw (in multiples of 100): ");
                int w = sc.nextInt();

                if (w % 100 != 0) {
                    System.out.println("Invalid amount. Please enter multiples of 100.");
                } else if (w > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    System.out.println("Dispensing notes:");
                    for (int note : notes) {
                        int count = w / note;
                        if (count > 0) {
                            System.out.println(note + " x " + count);
                            w = w % note;
                        }
                    }
                    balance -= w; // deduct from balance
                    System.out.println("Please collect your cash.");
                    // balance -= w; // deduct from balance
                    // System.out.println("Remaining balance: ₹" + balance);
                }
            } else {
                System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Wrong PIN.");
        }

        sc.close();
    }
}
