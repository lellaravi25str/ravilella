package example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception123 
{
	int z;
	int x;
	int y;
	
	
	public static void main(String[] args) 
	{
		Exception123 e=new Exception123();
		e.m1();
		System.out.println(e.z);
	}
	
	void m1() 
	{
		int i;
		System.out.println(i);
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ravilella\\input1.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
