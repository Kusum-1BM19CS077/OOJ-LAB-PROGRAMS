/*Develop a Java program to create a class PLAYER with member variables name,
matches_played and average. This class has an abstract method cal_average(String,int,int).
Derive two classes BATSMAN and BOWLER from PLAYER. Class BATSMAN has a
member variable runs_scored. Class BOWLER has a member variable runs_given. Create m
BATSMAN objects and n BOWLER objects. Calculate and display the average runs scored
by each BATSMAN and average runs given by each BOWLER.*/

import java.util.*;
abstract class PLAYER
{
String name;
int matches_played;
double average;
abstract void cal_average(String l,int m,int n);
}
class BATSMAN extends PLAYER
{
int runs_scored;
void cal_average(String x,int y,int z)
{
name=x;
matches_played=y;
runs_scored=z;
average=(double)runs_scored/matches_played;
System.out.println("The averge runs scored by "+name+" is "+average);
}
}
class BOWLER extends PLAYER
{
int runs_given;
void cal_average(String a,int b,int c)
{
name=a;
matches_played=b;
runs_given=c;
average=(double)runs_given/matches_played;
System.out.println("The average runs given by "+name+" is "+average);
}
}
class PLAYERMAIN1
{
public static void main(String args[])
{
int m,n,i;
Scanner ss=new Scanner(System.in);
System.out.println("Enter the number of Batsman and bowlers respectively");
m=ss.nextInt();
n=ss.nextInt();
BATSMAN BA[]=new BATSMAN[m];
for(i=0;i<m;i++)
{
BA[i]=new BATSMAN();
System.out.println("Enter name,number of matches played,and number of runs scored by Batsman "+(i+1)+":");
BA[i].name=ss.next();
BA[i].matches_played=ss.nextInt();
BA[i].runs_scored=ss.nextInt();
}
BOWLER BO[]=new BOWLER[n];
for(i=0;i<n;i++)
{
BO[i]=new BOWLER();
System.out.println("Enter name,number of matches played,and number of runs given by Bowler "+(i+1)+":");
BO[i].name=ss.next();
BO[i].matches_played=ss.nextInt();
BO[i].runs_given=ss.nextInt();
}
for(i=0;i<m;i++)
{
BA[i].cal_average(BA[i].name ,BA[i].matches_played,BA[i].runs_scored);
}
for(i=0;i<n;i++)
{
BO[i].cal_average(BO[i].name ,BO[i].matches_played,BO[i].runs_given);
}
}
}