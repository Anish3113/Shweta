package basicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class evensortarraylist {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(101);
		al.add(505);
		al.add(202);
		al.add(303);
		al.add(404);

		System.out.println(" Emelements in the list are:"+al);
		for(int i=0;i<al.size();i++)
		{
			int even=al.get(i)%2;
			if(even==0)
			{
				System.out.println(" This are even numberss in the list: "+al.get(i));
				al.remove(i);
			}
		}
		Collections.sort(al);
		 System.out.println("Sorted List: "+al);
	}

}
