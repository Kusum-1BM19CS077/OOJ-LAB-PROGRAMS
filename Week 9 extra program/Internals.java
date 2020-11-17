package CIE;
import java.util.Scanner;

public class Internals extends Student
{
   public int ciem[];
   
   public void display()
   {
	   ciem=new int[5];
	  Scanner t=new Scanner(System.in);
   System.out.println("CIE Marks for 5 subjects(out of 50):");
   for(int i=0;i<5;i++)
   ciem[i]=t.nextInt();
   }
}