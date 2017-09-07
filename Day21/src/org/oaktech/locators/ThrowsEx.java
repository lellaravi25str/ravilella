package org.oaktech.locators;

import java.io.FileNotFoundException;

public class ThrowsEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
	static void m1()
	{
		try {
			throw new FileNotFoundException("demo");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//CE
	}

}
