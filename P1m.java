import java.util.Scanner;

public class P1m {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String[] names = new String[5];
        System.out.println("Enter names: ");
        for(int i =0;i<5;i++){
            names[i]=sc.nextLine();
        }
        for(String c:names){
            if(c.charAt(0)=='S')
            System.out.println("Names starting with S are: "+c);
        }
    }
}
