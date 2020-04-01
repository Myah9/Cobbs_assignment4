package cobbs_problem1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;

public class DuplicateRemover {
	
	 List<String> uniqueWords = new ArrayList<>();
	 
	 public void remove(String dataFile)
	 {
	   try 
	   {
		  // read file 
	        BufferedReader bRead= new BufferedReader(new FileReader(dataFile));
	        String text = bRead.readLine();

	            while (text != null) 
	            {
	                String[] temp = text.split(" ");
	                for (String i : temp) 
	                {
	                    if (!uniqueWords.contains(i)) 
	                    {
	                        uniqueWords.add(i);
	                    }
	                }
	                
	                text = bRead.readLine();
	            }
	            
	            bRead.close();
	        }
	   
	   	
	   	  catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	  }
		
	 
	 public void write(String outputFile) throws FileNotFoundException 
	 {

	        PrintWriter writer = new PrintWriter(new File(outputFile));
	        
	        for (String writeWords : uniqueWords) 
	        {
	            writer.println(writeWords);
	        }
	        
	       
	        System.out.print(uniqueWords);
	        writer.close();
	    }
	}
		 
		 
	
