package A6;

import java.util.Scanner;

public class worker {
	private String fullname;
	int salarymultiplier;
	Scanner s = new Scanner(System.in);
	
	public void workerinformation() {
		System.out.println("Nhap fullname: ");
		fullname = s.nextLine();
		System.out.println("Nhap salarymultiplier: ");
		salarymultiplier=s.nextInt();
	}
}
