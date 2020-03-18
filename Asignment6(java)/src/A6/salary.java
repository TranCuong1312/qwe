package A6;

import java.util.Scanner;

public class salary {
	public enum professorornot{
		yeahh, nahh
	}
	public static void main(String[] args) {
		
		worker w =new worker();
		w.workerinformation();
		Scanner s =new Scanner(System.in);
		System.out.println("Nhap nghe nghiep: ");
		int job =s.nextInt();
		if(job==1){
				professor p = new professor();
				p.workerinformation();
				p.salary();
		}else {
				workerwhonotprofessor wwnp = new workerwhonotprofessor();
				wwnp.workerinformation();
				wwnp.salary();
		}
	}

}
