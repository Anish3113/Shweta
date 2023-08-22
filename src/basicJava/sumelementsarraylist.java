package basicJava;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class sumelementsarraylist {

	public static void main(String[] args) {	
		List<Integer> a1=new ArrayList<Integer>();
		a1.add(101);
		a1.add(505);
		a1.add(202);
		a1.add(303);
		a1.add(404);
		
		Integer a[]=new Integer[a1.size()];
		a1.toArray(a);
		int sum=0;
		
		System.out.println("Elements in array list are : ");
		for(Integer obj: a){
			System.out.println(obj+" ");
				
			sum+=obj;
			
		}
		System.out.println("Sum of elements  : "+sum);
	}

}
