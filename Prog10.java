import java.util.*;
class Prog10 {
    public static void main(String[] args) {
        Map<Integer,String>m = new HashMap<>();
        m.put(1,"Srinivas");
        m.put(2,"Srini");
        m.put(3,"Srinivasa");
        m.put(4,"Srini");
        m.put(4,"Srinivas k");
        m.remove(4);
        System.out.println(m);
    }
}