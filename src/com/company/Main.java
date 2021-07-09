package com.company;
public class Main {
//    public class TestStaticMethod {
        public static void main(String[] args) {
            Student.change();
            Student s1 = new Student(111, "Trung");
            Student s2 = new Student(222, "Thai");
            Student s3 = new Student(333, "Dat");

            s1.display();
            s2.display();
            s3.display();
        }
    }
