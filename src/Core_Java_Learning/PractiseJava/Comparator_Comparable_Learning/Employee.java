package Core_Java_Learning.PractiseJava.Comparator_Comparable_Learning;

import java.util.Comparator;

public class Employee {

    int id;
    String name;

    public Employee(int id, String name){
        this.id=id;
        this.name = name;
    }

    //Here you can also understand what is meaning of static class
    //Implementing comparator using static class of employee
    static class CompareWithId implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.id - o2.id;
        }
    }

}
