/*Write a program to demonstrate generics with multiple object parameters.*/
import java.util.*;
class Gener<T,U,V>
{
	T usn;
	U attendance;
	V cgpa;
	Gener(T n,U a,V c)
	{
		usn = n;
		attendance = a;
		cgpa = c;
	}
	void display()
	{
		System.out.println("=============================");
		System.out.println("USN of student: "+usn);
		System.out.println("Attendance = "+attendance);
		System.out.println("CGPA = "+cgpa);
	}
}
class GenDemo
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String USN;
		int attd;
		double cg;
		System.out.println("Enter the USN of the student:");
		USN = in.next();
		System.out.println("Enter the attendance % of the student:");
		attd = in.nextInt();
		System.out.println("Enter the CGPA of the student:");
		cg = in.nextDouble();
		Gener<String, Integer, Double>  ob = new Gener<String, Integer, Double>(USN, attd, cg);
		ob.display();
	}
}