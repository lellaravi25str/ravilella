package example1;

import examples.Tiger;

public class Test<Animal> extends Tiger
{
	
	public void m4(Animal a)//method definition
	{
		
		
	}
	public void m5(Tiger  t)//method definition
	{
		t.m3();
	}
	
	
public static void main(String[] args)
{
	Test  tt=new Test();
	
	Tiger t=new Tiger(); 
	tt.m5(t);
	
	
	
	
	
	
	
	
	
	
	}
}
