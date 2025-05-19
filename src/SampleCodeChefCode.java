import java.util.*;
import java.lang.*;
import java.io.*;

class SampleCodeChefCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
		    
		    int t=Integer.parseInt(br.readLine());
		    
		    while(t-->0){
		        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        int N = input[0];
		        int x = input[1];
		        
		        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		        
		        System.out.println("Just normal output ");
		    }
		    
		    
		}catch(Exception e){
		    e.printStackTrace();
		}

	}
}
