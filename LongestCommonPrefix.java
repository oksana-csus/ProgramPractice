
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
    	//0 <= strs[i].length <= 200
    	if (strs == null || strs.length == 0) return "";
    	String s = strs[0];
    	for(int i = 1; i<strs.length; i++ ) {
    		while(strs[i].indexOf(s)!=0){
    			s = s.substring(0, s.length()-1);
    			if(s.isEmpty()) return "";
    		}
    	}
        return s;
    }

}
