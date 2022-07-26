package com.regex;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {

        //Registration Validation using String regex
        //Creating Onjects

        Registration registration=new Registration();
        Scanner sc=new Scanner(System.in);

        //Using setter method to set vaues

        System.out.println("Enter ur First name");
        String firstName=sc.next();
        registration.setFirstName(firstName);

        System.out.println("Enter ur Last name");
        String lastName=sc.next();
        registration.setLastName(lastName);


        System.out.println("Enter ur number");
        String number=sc.next();
        registration.setNumber(number);

        System.out.println("Enter ur email");
        String email=sc.next();
        registration.setEmail(email);

        System.out.println("Enter ur Address");
        String address=sc.next();
        registration.setAddress(address);

        //Printing Objects
        System.out.println(registration);

    }
}
