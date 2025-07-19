import java.util.*;
class Prog5{
    public static void main(String[] args){
        ArrayList<String> s= new ArrayList<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        s.add(2,"6");
        s.remove(3);
        System.out.println(s);
        Collections.reverse(s);
        System.out.println(s);
    }
}