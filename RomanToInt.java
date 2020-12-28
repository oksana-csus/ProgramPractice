
public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}
	public static int romanToInt(String s) {
    	int n=0;
    	
    	if(s.length() >0 && s.length() < 16) {
    		for(int i=0; i < s.length(); i++) {
    			char p = s.charAt(i);
    			switch(p) {
    			  case 'I':
    				  if(i<s.length()-1) {
        				  if((s.charAt(i+1))=='V'){
        					  System.out.println("Letter iv add 4");
        					  n+=4;
        					  i++;
        					  break;
        				  }
        				  if((s.charAt(i+1))=='X'){
          					  System.out.println("Letter ix add 9");
        					  n+=9;
        					  i++;
        					  break;
        				  }

    				  }
      					  System.out.println("Letter i add 1");
    					  n+=1;
    					  break;

    			    
    			  case 'V':
  					  System.out.println("Letter v add 5");
    				  n+=5;
    			    break;
    			  //X can be placed before L (50) and C (100) to make 40 and 90. 
    			  case 'X':
    				  if(i<s.length()-1) {
        				  if((s.charAt(i+1))=='L'){
          					  System.out.println("Letter xl add 40");
        					  n+=40;
        					  i++;
        					  break;
        				  }
        				  if((s.charAt(i+1))=='C'){
          					  System.out.println("Letter xc add 90");
        					  n+=90;
        					  i++;
        					  break;
        				  }
    				  }
    				
      					  System.out.println("Letter x add 10");
        				  n+=10;
            			  break;
    				  

      			  case 'L':
  					  System.out.println("Letter l add 50");
      				n+=50;
      			    break;
      			  //C can be placed before D (500) and M (1000) to make 400 and 900.
    			  case 'C':
    				  if(i<s.length()-1) {
        				  if((s.charAt(i+1))=='D'){
          					  System.out.println("Letter cd add 400");
        					  n+=400;
        					  i++;
        					  break;
        				  }
        				  if((s.charAt(i+1))=='M'){
          					  System.out.println("Letter cm add 900");
        					  n+=900;
        					  i++;
        					  break;
        				  }
    				  }
    		
      					  System.out.println("Letter c add 100");
        				  n+=100;
            			  break;
    				  
    			  case 'D':
  					  System.out.println("Letter d add 500");
    				  n+=500;
      			    break;
    			  case 'M':
  					  System.out.println("Letter m add 1000");
    				  n+=1000;
      			    break;
    			  default:
    			      System.out.println("Invalid letter.");
    			      break;
    			}
    		}
    		
    	}
	
    	return n;
    }

}
