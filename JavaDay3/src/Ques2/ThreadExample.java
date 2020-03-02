package Ques2;

class Runners extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try{System.out.println("Hello"+i);
                Thread.sleep(100);}
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }
}

public class ThreadExample {

    public static void main(String[] args)
    {
        Runners t1=new Runners();
        Runners t2=new Runners();
        t1.start();
        t2.start();
    }
}
