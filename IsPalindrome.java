
public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1211));
	}
	public static boolean isPalindrome(int x) {
		if(x<0) return false;
		int length = (String.valueOf(x).length());
		int temp = x;
		int n = 0;
		for(int i = 0; i< length; i++){
			n *= 10;
			n += temp % 10;
			temp/=10;
			
		}
		if(x == n) {return true;}
		
		return false;
    }
}
