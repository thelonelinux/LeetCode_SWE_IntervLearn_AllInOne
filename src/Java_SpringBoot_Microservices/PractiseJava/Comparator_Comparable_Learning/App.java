package Java_SpringBoot_Microservices.PractiseJava.Comparator_Comparable_Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class App {

    public static void main(String[] args) {

        //EMPLOYEE
        Employee e1 = new Employee(1, "Anju");
        Employee e2 = new Employee(5, "Manju");
        Employee e3 = new Employee(4, "Shanju");
        Employee e4 = new Employee(2, "Ghanju");

        List<Employee> list = new ArrayList<Employee>();
        list.add(e1); list.add(e2); list.add(e3); list.add(e4);

        System.out.print("Employee = Without Sorting :: ");
        list.forEach(employee -> System.out.print(" " + employee.id + " " + employee.name + " => "));

        System.out.println();
        System.out.print("Employee = in sorted :: ");
        list.sort(new Employee.CompareWithId()); //sort with inner static class implementing comparator
        list.forEach(employee -> System.out.print(" " + employee.id + " " + employee.name + " => "));

        //TEACHER
        Teacher t1 = new Teacher(1, "Vicky");
        Teacher t2 = new Teacher(2, "Prasad");
        Teacher t3 = new Teacher(3, "Kumar");

        List<Teacher> list2 = new ArrayList<>();
        list2.add(t1); list2.add(t3); list2.add(t2);

        System.out.println();
        System.out.print("UnSorted List : ");
        list2.forEach(teacher -> System.out.print(" " + teacher.id + " " + teacher.name + " => "));

        //Sorting using comparator
        Comparator<Teacher> teacherComparator = new Teacher();
        Collections.sort(list2, new Teacher());

        Collections.sort(list2, teacherComparator);
        list2.sort(teacherComparator);

        //Sorting using comparable, Here just write direct
        Collections.sort(list2);

        System.out.println();
        System.out.print("Sorted List in Descending : ");
        list2.forEach(teacher -> System.out.print(" " + teacher.id + " " + teacher.name + " => "));

    }




}
