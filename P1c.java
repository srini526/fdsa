import java.util.*;
public class P1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>0 && age<100)
            if(age>=18)
                System.out.println("Eligible to vote");
            else
                System.out.println("Not eligible to vote");
        else
        System.out.println("Invalid age");
        

    }
}
