package Ques4;

interface detail {
    Employee get(String var1, String var2, Integer var3);
}

class Employee {
    String name;
    String city;
    Integer age;

    public Employee(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String toString() {
        return "name: " + this.name + " city: " + this.city + " age: " + this.age;
    }
}

public class ConstructorReference {
    public ConstructorReference() {
    }

    public static void main(String[] args) {
        detail emp = Employee::new;
        System.out.println(emp.get("Aman", "Gurgaon", 22));
    }
}
