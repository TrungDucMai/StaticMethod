package com.company;

public class Student {
    private int rollo;
    private  String name;
    private static String collage = "BBDIT";

    Student(int r, String n){
        rollo =r;
        name = n;
    }

    static void change(){
        collage = "Codegym";
    }
    void display(){
        System.out.println(rollo + " " + name + " " + collage);
    }
}

