import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		Collections.sort(fruits);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
	}
}
