package ex01;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        String name1 = "Main";
//        String name2 = new String("Main");
//        String name3 = "Main";
//
//        if(name1 == name2)
//            System.out.println("name2 Equal.");
//        if(name1 == name3)
//            System.out.println("name3 Equal.");
//
//        if(name1.equals(name2))
//            System.out.println("name2 Equal.");
//        if(name1.equals(name3))
//            System.out.println("name3 Equal.");

        Member m1 = new Member(92);
//        Member m2 = new Member(92);

//        if(m1 == m2)
//            System.out.println("Id is equal.");
//
//        if(m1.equals(m2))
//            System.out.println("Id is equal.");
//        else
//            System.out.println("Id is not equal");

        HashMap<Member, String> student = new HashMap<Member, String>();
        student.put(m1, "Donggeon Lee");

        Member m2 = new Member(92);
        System.out.println("Name is " + student.get(m2));
    }
}
