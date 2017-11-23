package findAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicates(new int[] {1,5,123,213,2,5,1,2,5,2,6,5,3,5,1,2,0,3,65,2,3});
	}

	
	 public static List<Integer> findDuplicates(int[] nums) {
	        
		 HashSet<Integer> ints = new  HashSet<Integer>();
		 List<Integer> duplicates = new ArrayList<Integer>();
		 for(int intt: nums) {
			 if(!ints.add(intt)) {
				 duplicates.add(intt);
			 }	 
		 }
		 return duplicates;		 
	    }
	 
}
