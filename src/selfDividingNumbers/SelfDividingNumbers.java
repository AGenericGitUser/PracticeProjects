package selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		System.out.println(getSelfDividingNumbers(0,200));

	}
	
	public static List<Integer> getSelfDividingNumbers(int p_from, int p_to) {
		if (p_from>p_to) return new ArrayList<Integer>();
		List<Integer> selfDivisible = new ArrayList<Integer>();
		for (int i=p_from;i<=p_to;i++) {
			if(checkSelfDivide(i)) selfDivisible.add(i);
		}
		return selfDivisible;
	}

	public static boolean checkSelfDivide(int p_intToCheck) {

		for(int j = p_intToCheck;j!=0;j/=10) {
			if(j%10 == 0)return false;
			if(p_intToCheck % (j%10) != 0) return false;
		}
		return true;//
	}
}
