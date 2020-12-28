
public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	/*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.*/
    public static int maxSubArray(int[] nums) {
    	int sum =0;
    	int maxSum = Integer.MIN_VALUE;
    	if(nums.length==1) {return nums[0];}
        for(int i=0; i <nums.length; i++) {
        	if(sum<0) {
        		sum=nums[i];
        		System.out.println("sum < 0");
        	}else {
        		sum+=nums[i];
        		System.out.println("sum + =  nums[i]");
        	}
        	if(sum>maxSum) {
        		maxSum = sum;
        		System.out.println("sum>maxSum");
        	}
        }
        
        return maxSum;
    }
}
