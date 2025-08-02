import java.util.Scanner;

public class P1l {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []a= new int[6];
        for(int i=0;i<6; i++){
            System.out.println("Enter the values");
            a[i]=sc.nextInt();
        }
        int[]cold = new int[6];
        for (int i = 0 ; i < 6;i++){
            if (a[i]<=10) {
                cold[i]=a[i];
                System.out.println("Cold array "+cold[i]);
            }
        }
        int[]hot = new int[6];
        for (int i = 0 ; i < 6;i++){
            if (a[i]>10) {
                hot[i]=a[i];
                System.out.println("Cold array "+hot[i]);
            }
        }
    }
}
