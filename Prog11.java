import java.util.*;
class Prog11{
    public static void main(String[] args){
        Map<Integer,String>ma = new HashMap<>();
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<3;i++){
        System.out.println("Enter the Student name :");
        String name =sc.nextLine();
        System.out.println("Enter the Student marks :");
        int marks = sc.nextInt();
        sc.nextLine();
        ma.put(marks,name);
        }
        System.out.println(ma);
    }
}