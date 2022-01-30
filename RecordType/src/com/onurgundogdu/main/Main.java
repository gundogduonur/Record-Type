package com.onurgundogdu.main;

import com.onurgundogdu.record.Student;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1L,"Onur","Gündoğdu");
        Student s2=new Student(2L,"Gündoğdu","Onur");
        Student s3=new Student(3L,"","");
        System.out.println(s1.id()+" "+s1.firstname()+" "+s1.lastname());
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s3);
    }
}
