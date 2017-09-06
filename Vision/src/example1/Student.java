package example1;

public class Student 
{
	int rollno;
	String sname;
	
	Student(int rollno,String sname)
	{
		this.rollno=rollno;
		this.sname=sname;
	}
	
	public Student(int i) {
		this.rollno=i;
	}

	public static void main(String[] args) 
	{
		Student s1=new Student(101,"uday");
		
		Student s2=new Student(102,"kumar");
		
		Student s3=new Student(103);
		
			System.out.println(s1.rollno);
			System.out.println(s1.sname);
			System.out.println(s2.rollno);
			System.out.println(s2.sname);
	}

}
