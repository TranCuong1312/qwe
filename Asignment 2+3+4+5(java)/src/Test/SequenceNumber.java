package Test;

import java.util.Scanner;

public class SequenceNumber {
	String a,b;
	void Input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so day so: ");
		int n= scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Nhap so thu "+i+": ");
			String a= scanner.nextLine();
			String b=scanner.nextLine();
			
		}
		
	}
	
	void Print() {
		System.out.println("Day so la"+a+b);
	}
	
	
	
	
}
