package org.oaktech.locators;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IOEx {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		PrintWriter pw=null;
		String line=null;
		 boolean b=false;
		try
		{
		 br=new BufferedReader(new FileReader("C:\\Users\\ravilella\\Documents\\input1.txt"));
		 pw=new PrintWriter("C:\\Users\\ravilella\\Documents\\output.txt");
	     line=br.readLine();
	    
	     if(line==null)
	     {
	    	 throw new Exception("no data");
	     }
	    	 
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
			
		}
		}
		catch(Exception e)
		{
			System.out.println("please check data avilability in input file");
			b=true;
			
		}
		finally
		{
			br.close();
			pw.close();
		}
	
		pw.flush();
		if(b==false)
		System.out.println("pls check output text file");
	
	}

}
