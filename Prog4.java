import java.util.*;
class Prog4{
	public static void main(String[] args) {
	    ArrayList<String>s=new ArrayList<>();
	    s.add("pranav");
	    s.add("sujay");
	    s.add("vijay");
	    s.add(0,"shashank");
	    s.remove("shashank");
	    s.remove(2);
	    s.clear();
		System.out.println(s);
	}
}