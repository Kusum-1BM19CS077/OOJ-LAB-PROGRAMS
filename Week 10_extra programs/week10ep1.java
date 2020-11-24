/*1. Implement Interfaces – QUEUE OPERATIONS */
import java.util.*;
interface IntQueue {
    void insert_rear(int item); 

    int delete_front();
    void displayQ(); 
    }

 class Queue implements IntQueue {
 private int q[];
 private int rear;
 private int front;
     
 Queue(int size) {
 q = new int[size];
 rear = -1;
 front = 0;
 }
      
 public void insert_rear(int a) {
 if(rear==q.length-1) 
 System.out.println("Queue is full.");
 else
 q[++rear] = a;
 }
     
 public int delete_front() {
 if(front>rear)
    {
        front=0;
        rear=-1;
        return -1;
    }
    return q[front++];
 }
public void displayQ()
{
    int i;
    if(front>rear)
    {
        System.out.println("Queue is empty\n");
        return ;
    }
    System.out.println("Contents of queue\n");
    for(i=front;i<=rear;i++)
    {
        System.out.println(q[i]);
    }
}
    }

class QueueInter {
 public static void main(String args[]) {
Scanner ss=new Scanner(System.in);
Queue myqueue = new Queue(3);
int choice;
    for(;;)
    {
        System.out.println("\n1:Insert rear\n2:Delete front\n3:Display\n4:exit\n");
        System.out.println("Enter the choice");
        choice=ss.nextInt();
        switch(choice)
        {
            case 1:System.out.println("Enter the item to be inserted");
            int item=ss.nextInt();
            myqueue.insert_rear(item);
            break;
            case 2:item=myqueue.delete_front();
            if(item==-1)
                System.out.println("Queue is empty\n");
            else
                System.out.println("Item deleted="+item);
            break;
            case 3:myqueue.displayQ();
            break;
            default:System.exit(0);
        }
    }


 }
}