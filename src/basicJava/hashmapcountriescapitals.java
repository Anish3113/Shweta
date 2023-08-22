package basicJava;
import java.util.*;

public class hashmapcountriescapitals {

	public static void main(String[] args) {
			HashMap hm=new HashMap();
			hm.put("India", "Delhi");
			hm.put("France", "Parris");	
			hm.put("Germany", "Berlin");
			hm.put("Afghanistan", "kabul");
			
			System.out.println("Map ="+hm);
			System.out.println("Keys....");
			Set keys=hm.keySet();
			Iterator	 i=keys.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			System.out.println("Values....");
			Collection getValues=hm.values();
			i=getValues.iterator();
			while(i.hasNext())	
			{
				System.out.println(i.next());
			}
			
		}

}
