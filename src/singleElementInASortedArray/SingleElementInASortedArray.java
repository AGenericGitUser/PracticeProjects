package singleElementInASortedArray;

public class SingleElementInASortedArray {

	public static void main(String[] args) {
		singleNonDuplicate(new int[] {1,1,2});
	}
	
    public static int singleNonDuplicate(int[] nums) {
        

    	for(int i = 0; i<nums.length-1;) {
    		if(i>=nums.length-1) return nums[nums.length-1];
    		
    		if(nums[i]==nums[i+1]) {
    			i += 2;
    		}else {
    			return nums[i];
    		}
    	}
    	return nums[nums.length-1];
    }
    
    public static int binarySearchSolution(int[] nums) {
    	int start = 0;
    	int end = nums.length-1;
    	
    	while(start<end) {
    		int mid = (end - start)/2;
    		if (mid % 2 == 1) mid --;
    		
    		if(nums[mid+1] != nums[mid] ){
    			end = mid;
    		}else {
    			start = mid + 2;
    		}
    	}
    	return nums[start];
    }
}
