
public class ProjectRashed {
	public static String capitalize(String name)
	{
		String first_name =name.toLowerCase().replace('d','D').replace('a','A');
		return(first_name);

	}
	
	static void myMethod(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }
	
	 static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!"); 
		      
		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!"); 
		    }
		    
		  } 

	 


	public static void main(String[] args) {
	
		int i = 1;
	    while (i < 10) {
	      if (i == 6) {
	        i++;
	        break;
	      }
	      System.out.println(i);
	      i++;
	    }
		        
		        
		 myMethod("Rashed", 23);
		    myMethod("Khaled", 22);
		    myMethod("Mohammed",27);
		    checkAge(20);
		    System.out.println(""
		    		+ ""
		    		+ ""
		    		+ "");
		    String names[] = {"RASHED","MOHAMMED","KHALED","SAAD","ABDULLAH"};
			
			for(String name:names)
			{

				System.out.println(capitalize(name));
			}
		    

	}

	}

