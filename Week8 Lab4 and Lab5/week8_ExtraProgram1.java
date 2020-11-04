/*Write a program which has an abstract class Solid and implements cylinder, cone and
sphere by inheriting from solid to find surface area and volume.*/

import java.util.*;
import static java.lang.Math.sqrt;
abstract class Solid
{
double r,h;
abstract void areavolume();
}

class cylinder extends Solid
{
void areavolume()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter radius and height of the cylinder");
r=ss.nextInt();
h=ss.nextInt();
double surfacearea;
double volume;
surfacearea=(2*3.14*r*h)+(2*3.14*r*r);
volume=(3.14*r*r*h);
System.out.println("The surface area of cylinder is "+surfacearea);
System.out.println("The volume of cylinder is "+volume);
}
}
class cone extends Solid
{
void areavolume()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter radius and height of the cone");
r=ss.nextInt();
h=ss.nextInt();
double surfacearea;
double volume;
surfacearea=(3.14*r)*(r+sqrt((h*h)+(r*r)));
volume=(3.14*r*r*h)/3.0;
System.out.println("The surface area of cone is "+surfacearea);
System.out.println("The volume of cone is "+volume);
}
}
class sphere extends Solid
{
void areavolume()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter radius of sphere");
r=ss.nextInt();
double surfacearea;
double volume;
surfacearea=4*3.14*r*r;
volume=(4*3.14*r*r*r)/3.0;
System.out.println("The surface area of circle is "+surfacearea);
System.out.println("The volume of circle is "+volume);
}
}

class Solidmain
{
public static void main(String args[])
{
int ch;
Scanner ss=new Scanner(System.in);
cylinder cy=new cylinder();
cone co=new cone();
sphere sp=new sphere();
while(true){
System.out.println("Enter the choice of shape whose surface area and volume has to be calculated");
System.out.println("1.Cylinder\n2.Cone\n3.Sphere\n4.Exit");
ch=ss.nextInt();
switch(ch)
{
case 1:
cy.areavolume();
break;
case 2:
co.areavolume();
break;
case 3:
sp.areavolume();
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid choice!");
}
}
}
}