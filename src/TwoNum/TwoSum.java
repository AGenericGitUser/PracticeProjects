package TwoNum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter values to select from seperated by commas. Press enter to confirm");
		String valuesString = in.next();
		System.out.println("Select target number, enter to confirm");
		int targetInt = in.nextInt();
		
		int[] inputIntArray = convertStringArrayToIntArray(valuesString.split(","));
		int[] answer = twoSum(inputIntArray, targetInt);
		
		if(answer==null) {
			System.out.println("No solution");
		}else {
			System.out.println("The numbers " + inputIntArray[answer[0]]+ " + " + inputIntArray[answer[1]] + " add up to the target: " + targetInt );
		}
		}
	}
    public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (i==j) continue;
                if (nums[i]+nums[j]==target) {
                    return new int[]{i,j};
            }
            }
        }
        return null;
    }
    
    public static int[] convertStringArrayToIntArray(String[] p_StringArray) {
    	int[] intArray = new int[p_StringArray.length];
    	for(int i = 0;i<p_StringArray.length;i++) {
    		intArray[i] = Integer.parseInt(p_StringArray[i]);
    	}
    	return intArray;
    }
    
    public static int[] fastTwoSum(int[] nums, int target) {
    	int[] result = new int[2];
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    		for (int i = 0;i<nums.length;i++) {
    			if (map.containsKey(target-nums[i])) {
    				result[1]=i+1;
    				result[0]=map.get(target-nums[i]);
    				return result;
    			}
    			map.put(nums[i], i+1);
    		}
    	return result;
    }
}
