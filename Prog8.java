import java.util.*;

class Prog8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Section A Names
        System.out.println("Enter the Names of sec A Students:");
        HashSet<String> A = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            A.add(sc.nextLine());
        }

        // Section A Roll Numbers
        System.out.println("Enter the Roll Nos. of sec A Students:");
        HashSet<Integer> N = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            N.add(sc.nextInt());
        }

        sc.nextLine(); // consume leftover newline before reading names

        // Section B Names
        System.out.println("Enter the Names of sec B Students:");
        HashSet<String> B = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            B.add(sc.nextLine());
        }

        // Section B Roll Numbers
        System.out.println("Enter the Roll Nos. of sec B Students:");
        HashSet<Integer> NN = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            NN.add(sc.nextInt());
        }

        // Finding common roll numbers
        N.retainAll(NN);
        System.out.println("Common Roll Numbers:");
        System.out.println(N);
    }
}
