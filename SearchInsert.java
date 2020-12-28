
public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3};
		
		System.out.println(searchInsert(nums, 3));

	}
    public static int searchInsert(int[] nums, int target) {
    	if(nums.length==1) {
    		if(target>nums[0]) {
    			return 0+1;
    		}else {
    			return 0;
    		}
    	}
        for(int i =0; i<nums.length-1; i++) {
        	if(nums[i]==target) {
        		return i;
        	}else if(target >nums[i] && target <nums[i+1]) {
        		return i+1;
        	}else if(target >nums[i] && target ==nums[i+1]) {
        		return i+1;
        	}else if(target >nums[nums.length-1]&& i==nums.length-2) {
        		return i+2;
        	
        	}        	
        }
    	
    	return 0;
    }
}
