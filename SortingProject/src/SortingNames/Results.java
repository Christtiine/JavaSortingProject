package SortingNames;
import java.util.ArrayList;
public class Results {

	public static void main(String[] args) {
		Names list = new Names();
		ArrayList<String> listMain = list.myNames();
		System.out.println("Original star list: " + listMain);

		Sort sort = new Sort();
		ArrayList<String> sortMain = sort.mySort();
		System.out.println("Star list sorted: " + sortMain);
		
		ReverseSort reversed = new ReverseSort();
		ArrayList<String> reversedMain = reversed.myReverse();
		System.out.println("Reversed sort of star list: " + reversedMain);
	}

}
