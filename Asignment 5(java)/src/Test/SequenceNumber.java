package Test;

import java.util.Arrays;
import java.util.Scanner;

public class SequenceNumber {

	public void Input() {
		try{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so day so: ");
		int n= scanner.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap so thu "+i+": ");
			a[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		}
		catch(Exception e){
			System.out.println("Something go wrong");
		} finally {
			System.out.println("Try catch had fail");
		}
	
	}

	void Print() {
		Input();
	}
}	
