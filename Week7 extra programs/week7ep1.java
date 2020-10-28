/*1. Develop a Java program to create a class Student whose variables are usn, name and sem.  Derive a class Test from Student to include an array of cie marks of each course and their  corresponding credits in another array. Derive a class Exam from Test which includes an  array of see marks. Derive a class Result which calculates the grade for each course and the  
SGPA. Create n student objects and displays all the above details. 
*/
import java.util.*;
class Student {
	String usn;
	String name;
	int sem;
	void details()
	{
		Scanner z=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("Enter USN:");
		usn=z.next();
		System.out.println("Enter name:");
		name=z.next();
		System.out.println("Enter semester:");
		sem=z.nextInt();
	}
}
class Test extends Student {
	 int credits[];
	 int cie[];
     int t;

	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		t=s.nextInt();
		credits=new int[t];
		cie=new int[t];
		System.out.println("Enter credits and cie marks (out of 50) attained by the student in each subject");
		for(int i=0;i<t;i++)
		{
			credits[i]=s.nextInt();
			cie[i]=s.nextInt();
		}
	}
}
class Exam extends Test {
	int see[];
	void read()
	{
		Scanner a=new Scanner(System.in);
		see=new int[t];
		System.out.println("Enter SEE marks of student in each subject(Out of 100)");
		for(int i=0;i<t;i++)
		{
			see[i]=a.nextInt();
		}
	}
}
class Result extends Exam {
	int marks[];
	double calculate()
	{
		marks=new int[t];
		int tcp=0,tc=0;
		for(int i=0;i<t;i++)
		{
			tc=tc+credits[i];
			marks[i]=cie[i]+see[i]/2;
			if(marks[i]>=50)
			{
			tcp=tcp+(((marks[i]/10)+1)*credits[i]);
			}
			else if(marks[i]>=40 && marks[i]<50)
			{
				tcp=tcp+(4*credits[i]);
			}
		}
		return (double)tcp/tc;
	}
}

class Main {
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=ss.nextInt();
		Student a[] = new Student[n];
		Test b[]=new Test[n];
		Exam c[]=new Exam[n];
		Result d[]=new Result[n];
		for(int i=0;i<n;i++)
		{
			a[i]=new Student();
			a[i].details();
			b[i]=new Test();
			b[i].accept();
			c[i]=new Exam();
			c[i].read();
			d[i]=new Result();
			System.out.println("SGPA of Student "+(i+1)+" is :"+d[i].calculate());
		}
	}
}
		
			
		
	