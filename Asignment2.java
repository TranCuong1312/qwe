package Test;

import java.util.ArrayList;

import com.sun.tools.javac.util.ArrayUtils;

public class Asignment2 {

	private static final String ArrayUtils = null;

	public static void main(String[] args) {
		
		String[] Ho= {"North","South","West","East","NoWhere","Central","Pole"};
		String[] TenDem= {" In The "," On The "," From The "," Far From The "," Close To The "," In The End Of "," Under The "};
		String[] Ten= {"North","South","West","East","NoWhere","Central","Pole"};
		
		
		
		
		
		
		
		int ID[]={1,2,3,4,5,6,7};
		
		String[] Brithday= {"1/1/1999","2/2/1999","3/3/1999","4/4/1999","5/5/1999","6/6/1999","7/7/1999"};
		
		
		
	
		String[] name = new String[7];
		for(int i=0;i<7;i++){
			name[i] =Ho[i]+TenDem[i]+Ten[i];
			
		}
		for(int i=0;i<7;i++){
		 System.out.println(name[i]);
		}
		
		String[] info = new String[7];
		for(int i=0;i<7;i++){
			info[i] =name[i]+" "+ID[i]+"  "+Brithday[i];
		}
		
		for(int i=0;i<7;i++){
			 System.out.println(info[i]);
			}
		
		
	}

}
