package SortingNames;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseSort {
	
	public ArrayList<String> myReverse() {
		Names reverselist = new Names();
		ArrayList<String> reverse = reverselist.myNames();
		Collections.sort(reverse, Collections.reverseOrder());
		return reverse;
	}
}
