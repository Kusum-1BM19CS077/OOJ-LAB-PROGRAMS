/*Week 9-Lab Program 6

Solve this program and write the procedure you have used to
execute this in your observation

Create a package CIE which has two classes- Student and Internals. The
class Personal has members like usn, name, sem. The class Internals has an
array that stores the internal marks scored in five courses of the current
semester of the student. Create another package SEE which has the class
External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the
student. Import the two packages in a file that declares the final marks of n
students in all five courses.*/
import CIE.*;
import SEE.*;
import java.util.Scanner;
public class main
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n=s.nextInt();
		CIE.Student st[]=new CIE.Student[n];
		CIE.Internals in[]=new CIE.Internals[n];
		SEE.Externals e[]=new SEE.Externals[n];
		for(int i=0;i<n;i++)
		{
			st[i]=new CIE.Student();
			in[i]=new CIE.Internals();
			e[i]=new SEE.Externals();
			st[i].display();
			in[i].display();
			e[i].display();
			System.out.println("Total marks of student "+st[i].name+" in 5 subjects are:");
			for(int j=0;j<5;j++)
			{
				System.out.println(in[i].ciem[j]+(e[i].seem[j]/2));
			}
				
		}
	}
}