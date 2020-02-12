
public class Implicit {
	
	public static void main(String[] args) {
		
		byte a =100;
		int i= a;
		System.out.println(i);
		long l =i;
		System.out.println(l);
		
		char b='d';
		int c=b;
		System.out.println(c);
		
		int y=100;
		char r =(char) y;
		System.out.println(r);
	}
}
