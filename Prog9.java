import java.util.*;
class Prog9{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hobbies of person 1");
        HashSet<String> A=new HashSet<>();
        for(int i=0;i<5;i++)
        A.add(sc.nextLine());
        System.out.println("Enter the hobbies of person 2");
        HashSet<String> B=new HashSet<>();
        for(int i=0;i<5;i++)
        B.add(sc.nextLine());
        System.out.println(A.retainAll(B));
        System.out.println("Common hobbies are :"+A);
    }
}