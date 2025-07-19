// import java.util.*;
public class Prog3{
    static void machinePI(int n) throws Exception {
        if(n<5){
            throw new Exception("unfit");
        } else{
            System.out.println("Good");
        }
    }
    public static void main(String[] args){
        try{
            machinePI(5);
        } catch (Exception e){
            System.out.println("Exception reached");
        }
        finally{
            System.out.println("Finally");
        }
    }
}