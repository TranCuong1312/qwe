package A6;

public class professor extends worker {
	private String faculty;
	enum academydegree {bachelor, master, doctor};
	private int monthlyteachingtime;
	private int salary, allowance;
	
	@Override
	public void workerinformation() {
		 super.workerinformation();
		 System.out.println("Nhap faculty: ");
		 faculty = s.nextLine();
		 System.out.println("Nhap Monthly teaching time: ");
		 monthlyteachingtime=s.nextInt();
	}
	
	public int salary() {
		salary =salarymultiplier*730 +allowance+monthlyteachingtime*45;
		return salary;
	}
}
