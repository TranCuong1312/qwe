package Test;

public class TestSequence {
	public static void main(String[] args) {
		
		SequenceNumber sn=new SequenceNumber();
		sn.Input();
		sn.Print();
		
		QuickSort qs=new QuickSort();
		qs.Sort();
		
		SelectionSort ss=new SelectionSort();
		ss.Sort();
		
		InsertSort is=new InsertSort();
		is.Sort();
	}
}
