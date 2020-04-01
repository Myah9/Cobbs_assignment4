package cobbs_problem1;

import java.io.IOException;

public class Application {
	
	    public static void main(String[] arg) 
	    {

	    	try {
	    	
	        DuplicateRemover duplicateRemover = new DuplicateRemover();
	        duplicateRemover.remove("problem1.txt");
	        duplicateRemover.write("unique_words.txt");

	        System.out.println("\n Duplicate Remover Operation successfully done");
	    	}
	    	
	    	catch (IOException ex)
	    	{
	    		System.out.printf("ERROR: %s%n", ex);
	    	}
	    }
	

}
