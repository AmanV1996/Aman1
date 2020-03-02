package JavaDay4.Ques5;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test{

    String name;
    int salary;
    int age;

    public Test(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

class SortBySalary implements Comparator<Test>{

    @Override
    public int compare(Test o1, Test o2) {
        return o1.salary - o2.salary;
    }
}

public class Employee{
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();
        list.add(new Test("A", 20000, 22));
        list.add(new Test("B", 10000, 21));
        list.add(new Test("S", 10000, 22));
        list.add(new Test("T", 15000, 21));

        System.out.println("Unsorted");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

        Collections.sort(list, new SortBySalary());

        System.out.println("\nSorted by salary");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));

    }
}

