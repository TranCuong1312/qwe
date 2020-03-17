package A6;

import java.util.Scanner;

public class salary {
	public enum professorornot{
		yeahh, nahh
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		worker w =new worker();
		w.workerinformation();
		professorornot pon= professorornot.nahh;
		swicth(professorornot){
			case yeahh:
				professor p = new professor();
				break;
			case nahh:
				
				
		}
	}

}
