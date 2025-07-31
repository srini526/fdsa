import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int[]a = new int[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter the values");
            a[i]=sc.nextInt();
        }
        int max = a[0];
        for(int i = 0;i<5;i++){
            if(max<a[i])
            max=a[i];
        }
        System.out.println("Max value is: "+max);
        int min=a[0];
        for (int i = 0;i<5;i++){
            if(min>a[i])
            min=a[i];
        }
        System.out.println("Min value is: "+min);
        int[]even= new int[5];
        for(int i=0;i<5;i++){
            if(a[i]%2==0){
                even[i]=a[i];
            }
        }
        for(int i =0;i<5;i++)
        System.out.println(even[i]+" ");
    }
}
