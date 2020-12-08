/*Write a program which creates two threads, one thread displaying BMS College of
Engineering once every ten seconds and another displaying CSE once every two seconds.*/
class NewThread implements Runnable
{ 
	Thread t;
	String name;
	int time;
	NewThread(String nm,int tm)
	{
		name = nm;
		time = tm;
		t=new Thread(this, nm);
	}
   public void run()
   {
	   try
	   {
		   for(int n=20;n>0;n--)
		   {
			 System.out.println(name);
			 Thread.sleep(time);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Thread Interrupted");
	   }
	   
   }
}

class Week11Lab
{
	public static void main(String ss[])
	{
		NewThread bmsce=new NewThread("BMS College of Engineering",10000);
		NewThread cse=new NewThread("CSE",2000);
		bmsce.t.start();
		cse.t.start();
	}
}