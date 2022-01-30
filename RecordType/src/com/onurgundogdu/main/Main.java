package com.onurgundogdu.main;

import com.onurgundogdu.record.Student;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1L,"Onur","Gündoğdu");
        System.out.println(s1.id()+" "+s1.firstname()+" "+s1.lastname());
    }
}
