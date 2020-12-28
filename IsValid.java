import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class IsValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("){"));
	}
	
    public static boolean isValid(String s) {
    	LinkedList<String> list = new LinkedList<String>();
    	for(int i =0; i < s.length(); i++) {
    		if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') {
    			list.push(String.valueOf(s.charAt(i)));
    		}
    		if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']') {
    			char p = s.charAt(i);
    			switch(p) {
    			  case ')':
    				if(!list.isEmpty()&&((list.peek()).equals("("))) {
    					list.pop();
    				}else {
    					return false;
    				}
    				
    				break;
    			    
    			  case '}':
      				if(!list.isEmpty()&&((list.peek()).equals("{"))){
    					list.pop();
    				}else {
    					return false;
    				}
    			    break;
    			    
    			  case ']':
      				if(!list.isEmpty()&&((list.peek()).equals("["))) {
    					list.pop();
    				}else {
    					return false;
    				}
      			    break;
    			}
    			
    		}
    		
    	}
    	
    	if(list.isEmpty()) {
    	    return true;
    	}
    return false;
    }
    
    class Solution {

    	  // Hash table that takes care of the mappings.
    	  private HashMap<Character, Character> mappings;

    	  // Initialize hash map with mappings. This simply makes the code easier to read.
    	  public Solution() {
    	    this.mappings = new HashMap<Character, Character>();
    	    this.mappings.put(')', '(');
    	    this.mappings.put('}', '{');
    	    this.mappings.put(']', '[');
    	  }

    	  public boolean isValid(String s) {

    	    // Initialize a stack to be used in the algorithm.
    	    Stack<Character> stack = new Stack<Character>();

    	    for (int i = 0; i < s.length(); i++) {
    	      char c = s.charAt(i);

    	      // If the current character is a closing bracket.
    	      if (this.mappings.containsKey(c)) {

    	        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
    	        char topElement = stack.empty() ? '#' : stack.pop();

    	        // If the mapping for this bracket doesn't match the stack's top element, return false.
    	        if (topElement != this.mappings.get(c)) {
    	          return false;
    	        }
    	      } else {
    	        // If it was an opening bracket, push to the stack.
    	        stack.push(c);
    	      }
    	    }

    	    // If the stack still contains elements, then it is an invalid expression.
    	    return stack.isEmpty();
    	  }
    	}

}
