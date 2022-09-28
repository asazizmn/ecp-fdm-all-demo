import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		
		// sort
		Arrays.sort(fruits);
		
		// before sorting
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		

		
		


	}

}
