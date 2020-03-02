package Ques11;

public class Ques11 {

    static class BOI
    {
        public int roi=2;
        public String name="BOI";
        public int maxloan= 1000000;
        public void getDetails()
        {
            System.out.println("Our bank "+name+" gives maximum loan of Rs. "+maxloan+" at a rate "+roi+"%");
        }
    }

    static class SBI
    {
        public int roi=2;
        public String name="SBI";
        public int maxloan= 2000000;
        public void getDetails()
        {
            System.out.println("Our bank "+name+" gives maximum loan of Rs. "+maxloan+" at a rate "+roi+"%");
        }
    }
    static class ICICI
    {
        public int roi=3;
        public String name="ICICI";
        public int maxloan= 1500000;
        public void getDetails()
        {
            System.out.println("Our bank "+name+" gives maximum loan of Rs. "+maxloan+" at a rate "+roi+"%");
        }
    }

    public static void main(String[] args) {

        ICICI ob= new ICICI();
        SBI ob1= new SBI();
        BOI ob2= new BOI();

        ob.getDetails();
    }
}

