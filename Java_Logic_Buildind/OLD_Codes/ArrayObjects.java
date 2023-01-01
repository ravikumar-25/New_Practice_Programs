class Student
{	
	public int roll_no;
	public String name;


	Student()
	{
	
	}
	Student(int roll_no, String name)
	{
	 this.roll_no=roll_no;
	 this.name=name;
	}
}

public class ArrayObjects
{
	public static void main (String args[])
	{
	    Student [] arr = new Student[3];
		arr[0] = new Student(1, "Ravi");
		arr[1] = new Student(2, "Shashank");
		arr[2] = new Student(3, "Veer");
		
		for(int i=0;i<arr.length;i++)
		{
		 System.out.println("Element at "+i+" : "+arr[i].roll_no+","+arr[i].name); 
		
		}
	
	}
}