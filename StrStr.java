
public class StrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "ll"));
	}
    public static int strStr(String haystack, String needle) {
    	if(haystack.indexOf(needle)!=-1) {
    		return haystack.indexOf(needle);
    	}
    	
    	return haystack.indexOf(needle);
    }
}
