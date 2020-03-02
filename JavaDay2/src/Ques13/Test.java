package Ques13;

class MyCustomException extends Exception
{
    public MyCustomException(String message)
    {
        super(message);
    }
}

class Foo
{ public String getBar(int i) throws MyCustomException
{ if (i == 0)
{// throw our custom exception
    throw new MyCustomException("Anything can be entered but not zero ...");
}
else
{return "Thanks";
} }}

public class Test {
    public static void main(String[] args)
    {   // create a new foo
        Foo foo = new Foo();

        try
        {   // intentionally throw our custom exception by
            // calling getBar with a zero
            String bar = foo.getBar(0);
        }
        catch (MyCustomException e)
        {
            // print the stack trace
            e.printStackTrace(); }
    }
}
