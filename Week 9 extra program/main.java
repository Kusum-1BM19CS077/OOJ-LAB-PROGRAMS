/*Week 9-Extra program
Create a package CIE which has two classes- Student and Internals. The
class Personal has members like usn, name, sem. The class Internals has an
array that stores the internal marks scored in five courses of the current
semester of the student. Create another package SEE which has the class
External which is a derived class of Student. This class has an array that
stores the SEE marks scored in five courses of the current semester of the
student. Import the two packages in a file that declares the SGPA of n
students in all five courses.*/
import CIE.*;
import SEE.*;
import java.util.Scanner;
public class main
{
	public static void main(String args[])
	{
		int n;
		int tcp,tc;
		int credits[]=new int[5];
		int total[]=new int[5];
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
			System.out.println("Enter the credits for each subject:");
			for(int k=0;k<5;k++)
			{
				credits[k]=s.nextInt();
				total[k]=in[i].ciem[k]+(e[i].seem[k]/2);
			}
			tcp=0;tc=0;
		for(int l=0;l<5;l++)
		{
			tc=tc+credits[l];
			if(total[l]>=50)
			{
			tcp=tcp+(((total[l]/10)+1)*credits[l]);
			}
			else if(total[l]>=40 && total[l]<50)
			{
				tcp=tcp+(4*credits[l]);
			}
		}
		System.out.println("SGPA of student "+st[i].name+" is: "+(double)tcp/tc);
				
		}
	}
}
