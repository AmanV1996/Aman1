package Ques6;
import java.io.IOException;
public class Test {
    public static void main(String[] args) {


        try
        {
            int x=1;
            int y=0;
            int z;
            z= x/y;
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("reached finally block");
        }
    }
}
