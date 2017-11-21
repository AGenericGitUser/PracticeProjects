package lengthOfLongestSubstring;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {
		
		int answer = lengthOfLongestSubstring("asdasdasfjnskamldplkdsamkndmkqwlem");
		boolean caught = true;
	}

	 public static int lengthOfLongestSubstring(String s) {
	        
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		 int count = 0;
		 int maxCount=0;
			for (int i=0;i<s.length();i++) {
				if(set.add(s.charAt(i))) {
					count++;
					if(count>maxCount)maxCount=count;
				}else {
					removeChar(set,s.charAt(i));
					count = set.size();
					set.add(s.charAt(i));
					
				}
			}
		System.out.println(maxCount);
		return maxCount;	
	    }
	 
	 public static void removeChar(LinkedHashSet<Character> p_Set, char p_Char) {
		HashSet<Character> toRemove = new HashSet<Character>();	
		 for(Character c: p_Set) {
				if(c.equals(p_Char)){
					toRemove.add(c);
					p_Set.removeAll(toRemove);
					return;
				}
				toRemove.add(c);
			}
		 p_Set.removeAll(toRemove);
	 }
}