package Arrays;
import java.util.*;

public class SecondLargestIntegerusingCollections {

	public static void main(String[] args) {
		
		// basic declaration and addition of elements in an array
		int h[] = new int[5];
		h[0] =6;
		h[1]=7;
		h[2]=8;
		h[3]=9;
		h[4]=10;
		
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}
		

		
		 Integer number[] = {56,67,68,89,98,34};
		 
		 List<Integer> v = new ArrayList<>(Arrays.asList(number));
		 
		//given ArrayList
		//List<Integer> v = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));
		//inserting all the elements from ArrayList v to TreeSet s.
		Set<Integer> s = new TreeSet<>(v);
		//clear the ArrayList.
		v.clear();
		//insert all elements back in ArrayList in sorted order.
		for (int value : s) {
			v.add(value);
		}
		//the size of updated ArrayList.
		int n = v.size();
		//printing the second largest element in ArrayList.
		System.out.print("The Second Largest Element in ArrayList is: ");
		System.out.println(v.get(n-2));
	}
}



