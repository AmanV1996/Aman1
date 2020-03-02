package Ques9;


    import java.util.Scanner;

    public class TestTable extends Ques9{

        String type;
        int cost;
        Scanner input = new Scanner(System.in);
        void prop(){
            System.out.println("Type of Table(metal or wood)?");
            type=input.next();
            System.out.println("Cost of Table:");
            cost=input.nextInt();
        }
        public static void main(String[] args) {

            TestTable obj=new TestTable();
            obj.prop();
            obj.fireTest();
            obj.stressTest();
            System.out.println("It is a "+obj.type+" table having cost "+obj.cost);
            System.out.println("Result of fire test: "+obj.ftest);
            System.out.println("Result of stress test: "+obj.stest);
        }
    }


