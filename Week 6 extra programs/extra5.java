/*5. Design a Java program to accept a double array- Full. create two more arrays pos,
neg. Check every element of Full array and push the positive
numbers to pos array and negative numbers to neg. Count the number of
positives, negatives and zeros and display.*/
import java.util.Scanner;
class countinarray
{
public static void main(String xx[])
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ELEMENTS");
int n=s.nextInt();
int i;
int p=0;
int ne=0;
int z=0;
double full[]=new double[n];
double pos[]=new double[n];
double neg[]=new double[n];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
for(i=0;i<n;i++)
{
full[i]=s.nextDouble();
}
for(i=0;i<n;i++)
{
if(full[i]>0)
{
pos[p]=full[i];
p++;
}
else if(full[i]==0)
z++;
else
{
neg[ne]=full[i];
ne++;
}
}
System.out.println("THE ARRAY WITH POSITIVE ELEMENTS IS=");
for(i=0;i<p;i++)
{
System.out.print(pos[i]+" ");
}
System.out.println();
System.out.println("THE ARRAY WITH NEGATIVE ELEMENTS IS=");
for(i=0;i<ne;i++)
{
System.out.print(neg[i]+" ");
}
System.out.println();
System.out.println("THE NUMBER OF POSITIVE ELEMENTS IS="+p);
System.out.println("THE NUMBER OF ZERO ELEMENTS IS="+z);
System.out.println("THE NUMBER OF NEGATIVE ELEMENTS IS="+ne);
}
}