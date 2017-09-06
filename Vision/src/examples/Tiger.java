package examples;

class Animal
{
	public void m1()
	{
		System.out.println("Hi aim m1 method from Animal Class");
	}
}

class Lion extends Animal
{
	public void m2()
	{
		System.out.println("Hi aim m2 method from Lion Class");
	}
}

public class Tiger extends Lion
{
	
	public void m3()
	{
		System.out.println("Hi aim m3 method from Tiger Class : ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
