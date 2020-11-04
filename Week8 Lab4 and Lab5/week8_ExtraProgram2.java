/*Develop a Java program to implement the hierarchy given below. Include atleast one  appropriate member in each of these classes. Set and display details in each of the class  and create objects of the leaf members in the hierarchy.
*/
import java.util.*;
class Person
{
String n;
void display(String name)
{
n=name;
System.out.println("\nThe details of the person is as below:\nName:"+n);
}
}
class Employee extends Person
{
int id;
void display(String name,int i)
{
id=i;
n=name;
System.out.println("\nThe details of the employee is as below:\nName:"+n+"\nEmployee id:"+id);
}
}


class Student extends Person
{
int usn;
void display(String name,int u)
{
usn=u;
n=name;
System.out.println("\nThe details of the student is as below:\nName:"+n+"\nUSN no:"+usn);
}
}
class Teaching extends Employee
{
String j;
void display(String name,int i,String job)
{
id=i;
j=job;
n=name;
System.out.println("\nThe details of the teaching employee is as below:\nName:"+n+"\nEmployee id:"+id+"\nJob:"+j);
}
}
class NonTeaching extends Employee
{
String j;
void display(String name,int i,String job)
{
id=i;
j=job;
n=name;
System.out.println("The details of the non-teaching employee is as below:\nName:"+n+"\nEmployee id:"+id+"\nJob:"+j);
}
}

class UG extends Student
{
int age;
void display(String name,int u,int a)
{
usn=u;
n=name;
age=a;
System.out.println("\nThe details of the UG student is as below:\nName:"+n+"\nUSN no:"+usn+"\nAge:"+a);
}
}
class PG extends Student
{
int age;
void display(String name,int u,int a)
{
usn=u;
n=name;
age=a;
System.out.println("The details of the PG student is as below:\nName:"+n+"\nUSN no:"+usn+"\nAge:"+a);
}
}
class Personmain
{
public static void main(String[] args)
{
Person p=new Person();
Employee e=new Employee();
Student s=new Student();
Teaching t=new Teaching();
NonTeaching nt=new NonTeaching();
UG u=new UG();
PG pp=new PG();
p.display("Aakash");
e.display(p.n,123);
t.display(p.n,e.id,"Professor");
nt.display(p.n,e.id,"Doctor");
s.display(p.n,777777);
u.display(p.n,s.usn,18);
pp.display(p.n,s.usn,22);
}
}