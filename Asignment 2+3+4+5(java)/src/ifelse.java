
public class ifelse {
	
	public static void main(String[] args) {
		int length=args.length;
		int d1=Integer.parseInt(args[0]);
		int d2=Integer.parseInt(args[1]);
		int d3=Integer.parseInt(args[2]);
		int tb=(d1+d2+d3)/3;
		for (int i=0;i<length;i++)
		if(length==0) {
			System.out.println("Dude?");
		}else if(length>3){
			System.out.println("Come on, dude. Read the lines.");
			break;
		}else if(d1<0||d2<0||d3<0||d1>100||d2>100||d3>100){
			System.out.println("Come on, I need real numbers.");
			break;
		}else if(d1<35||d2<35||d3<35){
			System.out.println("Yup, dude!");
		}else if(35 <= tb & tb <= 59) {
			System.out.println("My friend!");
		}else if(59 < tb & tb <= 69) {
			System.out.println("B, no more than that.");
		}else if(tb>69) {
			System.out.println("Your m*****f****r!");
		}
	}
}
