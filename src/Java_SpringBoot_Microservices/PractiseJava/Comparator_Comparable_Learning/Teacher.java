package Java_SpringBoot_Microservices.PractiseJava.Comparator_Comparable_Learning;

import java.util.Comparator;

public class Teacher implements Comparator<Teacher>, Comparable<Teacher> {

    int id;
    String name;

    public Teacher(){

    }

    public Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }

    //From comparator interface method
    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t1.id - t2.id;
    }

    //From comparable interface method
    //Comparable is synchronized (Thread safe), hence it is slower as compared to comparator
    @Override
    public int compareTo(Teacher t1) {
        Teacher t  = new Teacher();
        return t.id - t1.id;
    }


}
