package cobbs_problem2;

import java.io.IOException;

public class Application {
	
	public static void main(String[] args) {

		
		try {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        duplicateCounter.count("problem2.txt");
        duplicateCounter.write("unique_word_counts.txt");
        System.out.println("\n Duplicate Remover Operation successfully done");
		}
		
		
		catch (IOException ex)
		{
			System.out.printf("ERROR: %s%n", ex);
		}
    }
	

}
