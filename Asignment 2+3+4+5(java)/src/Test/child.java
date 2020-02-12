package Test;

public class child extends parent{
	child(){
		System.out.println("Child "+ this);
	}
	
	void fi() {
		super.fi();
		System.out.println("Come on");
	}
}

