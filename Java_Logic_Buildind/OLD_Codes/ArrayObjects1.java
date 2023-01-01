class Student
{	
	public String name;


	Student()
	{
	
	}
	Student(String name)
	{
	 this.name=name;
	}
	
	public String toString()
	{
		return name;
	}
	
}

public class ArrayObjects1
{
	public static void main (String args[])
	{
	    Student [] arr = new Student[]{new Student("Ravi"),new Student("Shashank"), new Student("Veer")};
		
		
		for(Student s : arr)
		{
		 System.out.println(s); 
		
		}
	
	}
}