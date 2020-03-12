package Test;

import java.util.Scanner;

public class SequenceNumber {

	int Input() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so day so: ");
		int n= scanner.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap so thu "+i+": ");
			a[i]=scanner.nextInt();
		}
		return(a[n]);
		
	}
	
	void Print() {
		System.out.println(a[n]);
	}
	
	
	
	
}
