class Mythread1 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class Thread_Priority
 {
    public static void main(String args[])
     {
        Mythread1 t1 = new Mythread1();
        Mythread1 t2 = new Mythread1();
        try {
            System.out.println("Before changing priority : ");
            System.out.println("t1 priority : " + t1.getPriority());
            System.out.println("t2 priority : " + t2.getPriority());
                                
            t1.setPriority(10); // high priority
            t2.setPriority(1); // low priority
            System.out.println("After changin priority \nt1: " + t1.getPriority() + "\nt2: " + t2.getPriority());
            t1.start();
            t2.start();
        }
         catch (Exception e) 
         {
            System.out.println("Error: " + e);
        }

    }
}
