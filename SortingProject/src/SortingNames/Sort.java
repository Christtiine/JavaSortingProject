package SortingNames;
import java.util.ArrayList;
import java.util.Collections;
public class Sort {
	public ArrayList<String> mySort() {
		Names starlist = new Names();
		ArrayList<String> sorted = starlist.myNames();
		Collections.sort(sorted);
		return sorted;
	}

}
