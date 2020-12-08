/* Write a program to create a thread and find the sum of odd numbers from 1 to 100 in
this thread. Find the sum of even numbers for the same range in the main thread.*/
class Runnable1 implements Runnable{
    public void run(){		
		 try
	   {
		   int sum=0;
		   for(int i=1;i<=100;i+=2) 
           sum=sum+i;
		System.out.println("Sum of odd numbers from 1 to 100: "+sum);   
	   }
	   catch(Exception ie)
	   {
		   System.out.println("Child Thread Interrupted");
	   }
    }
}


class Mythread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        try
		{
			int s=0;
			for(int i=2;i<=100;i+=2)
            s=s+i;
		System.out.println("Sum of even numbers from 1 to 100: "+s);
		}
		catch(Exception ie)
		{
			System.out.println("Main Thread Interrupted");
		}
    }
}

