import java.util.Scanner;

public class p1n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("Enter the names ");
        for(int i = 0; i<3;i++){
            names[i]=sc.nextLine();
        }
        System.out.println("Names starting from S are : ");
        for (String c:names){
            if(c.charAt(0)=='S')
            System.out.println(c);
        }
    }
}
