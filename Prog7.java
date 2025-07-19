import java.util.*;
public class Prog7
{
	public static void main(String[] args) {
	    HashSet<Integer> s=new HashSet<>();
	    s.add(4);
	    s.add(2);
	    s.add(1);
	    s.add(3);
		System.out.println(s);
		HashSet<Integer> A=new HashSet<>();
	    A.add(4);
	    A.add(2);
	    A.add(7);
		System.out.println(A);
		System.out.println(A.retainAll(s));
		System.out.println(A);
	}
	
}