package Ques3;

class Ques3Cal {
    static int undefined = 1 / 0;
}

public class Test {
    public static void main(String args[]) {
        try
        {
            Class.forName("ClassAman");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
            //ex.printStackTrace();
        }

        try {
            // The following line would throw ExceptionInInitializerError
            Ques3Cal calculator1 = new Ques3Cal();
        }
        catch (Throwable t) {
            System.out.println(t);
        }
        Ques3Cal calculator2 = new Ques3Cal();
    }
}
