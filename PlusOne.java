
public class PlusOne {

	public static void main(String[] args) {
		int[] digits = {0, 0};
		System.out.println(plusOne(digits));
	}
	
    public static int[] plusOne(int[] digits) {
    	
    	if(digits[digits.length-1]!=0) {
        	for(int i = (digits.length-1); i>= 0; i--) {
        		if(digits[i]!=9) {
        			digits[i]+=1;
        			break;
        		}else {
        			digits[i]=0;    	
        		}
        	}
        	
        	int[] n = new int[digits.length+1];
        	if(digits[0]==0) {
        		n[0]= 1;
        		int j = 0;
            	for(int i = 1; i< n.length ; i++) {
            		n[i]=digits[j];
            		j++;
            	}
            	return n;
        	}
        	
        	
        	return digits;
        	
    	}else {
    		digits[digits.length-1]=+1;

    		return digits;
    	}
    
    }
}
