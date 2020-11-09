/*1. Develop a Java program to create a class Student whose variables are usn, name and sem.  Derive a class Test from Student to include an array of cie marks of each course and their  corresponding credits in another array. Derive a class Exam from Test which includes an  array of see marks. Derive a class Result which calculates the grade for each course and the  
SGPA. Create n student objects and displays all the above details. 
*/
import java.util.*;
class Student {
	String usn;
	String name;
	int sem;
	Student()
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

	Test()
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
	int see[]=new int[t];
	Exam()
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter SEE marks of student in each subject(Out of 100)");
		for(int i=0;i<t;i++)
		{
			see[i]=a.nextInt();
		}
	}
}
class Result extends Exam {
	Result()
	{
	}
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
		 int n,i;
    Scanner in  = new Scanner(System.in);
    System.out.println("Enter the no of students");
    n  = in.nextInt();
    Result r[] = new Result[n];
    System.out.println("Enter the details of all the students");
    for(i=0;i<n;i++)
    {
      r[i] = new Result();
      System.out.println("SGPA of Student "+(i+1)+" is :"+r[i].calculate());
    }
    
		
	}
}
			
		
	
