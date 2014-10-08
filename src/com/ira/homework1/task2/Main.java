package com.ira.homework1.task2;

/**
 * Created by Ira on 08.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ira");
        p1.setPosition(Position.DEVELOPER);

        Person p2 = new Person("Ira");
        p2.setPosition(Position.DEVELOPER);

        if (p1 == p2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        if (p1.equals(p2)){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
