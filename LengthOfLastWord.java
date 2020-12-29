
public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("H "));
	}
    public static int lengthOfLastWord(String s) {
        
        if(!s.isEmpty()) {
        	if(s.contains(" ")) {

        		String[] a = (s.trim().split(" "));
        		return a[a.length-1].length();
        	}
        	return (s.length());
        }
    	return 0;
    }
}
