package com.company;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        while (true) {
            try {
                System.out.println("Enter User name");
                user.setName();
                System.out.println("Enter User age");
                user.setAge();
                System.out.printf("Знакомьтес это %s ему %d лет", user.getName(), user.getAge());
            } catch (IllegalNameLengthException ine) {
                System.out.println("Enter name out of range " + ine.getName());
                System.out.println(ine.getMessage());
            } catch (IllegalAgeException iae) {
                System.out.println("Enter age out of range " + iae.getAge());
                System.out.println(iae.getMessage());
            }
        }
    }
}
