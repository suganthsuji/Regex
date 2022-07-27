package com.regex;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {

        //Registration Validation using String regex
        //Creating Onjects

        Registration registration=new Registration();
        Scanner sc=new Scanner(System.in);

        //Using setter method to set values

        System.out.println("Enter ur number");
        String number=sc.nextLine();
        registration.setNumber(number);

        System.out.println("Enter ur First name");
        String firstName=sc.next();
        registration.setFirstName(firstName);

        System.out.println("Enter ur Last name");
        String lastName=sc.next();
        registration.setLastName(lastName);

        System.out.println("Enter ur email");
        String email=sc.next();
        registration.setEmail(email);

        System.out.println("Enter ur Address");
        String address=sc.next();
        registration.setAddress(address);

        System.out.println("Enter ur Password");
        String password=sc.next();
        registration.setPassword(password);

        //Printing Objects
        System.out.println(registration);

    }
}
