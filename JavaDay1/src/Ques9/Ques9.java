package Ques9;

enum House {
    House1(90000), House2(20000), House3(50000), House4(150000), House5(120000);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Ques9 {

    public static void main(String args[]){
        System.out.println("All car prices:");
        for (House c : House.values()) System.out.println(
                c + " costs " + c.getPrice() + " thousand dollars.");
    }
}
