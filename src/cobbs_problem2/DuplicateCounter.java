package cobbs_problem2;

import java.io.*;
import java.util.HashMap;
import java.util.Map; 

public class DuplicateCounter {
	
	//hashmap to store the frequency of element 
	Map<String, Integer> counter = new HashMap<String, Integer>();

    public void count(String dataFile) 
    {
        
        try {
        	BufferedReader buffRead = new BufferedReader(new FileReader(dataFile));
            String line = buffRead.readLine();
            
        while (line != null) 
        {
            String words[] = line.split(" ");
            
            
            for (String w : words) 
            {
                if (!counter.containsKey(w)) 
                {
                   counter.put(w, 1);
                } 
                
                else 
                {
                   int count = counter.get(w);
                   counter.put(w, count + 1);
                }
             }

            line = buffRead.readLine();
        }
     
        
        buffRead.close();
       }
        catch(IOException ex)
        {
        	System.out.printf("ERROR: %s%n", ex);
        }
    }

    
    
    
    
    public void write(String outputFile) throws FileNotFoundException 
    {

        PrintWriter pw = new PrintWriter(outputFile);
        for (Map.Entry<String, Integer> entry: counter.entrySet())
        {

            pw.println(entry.getKey() + ": " + entry.getValue());
        }
        pw.close();
    }

}
