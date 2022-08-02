package com.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LamdaMain {

    //Below are the Regex Pattern for Validations
    private static final String NAME_REGEX="^[A-Z][a-z]{3,}$";
    private static final String EMAIL_REGEX="^[a-z0-9]{3,}([.][a-z0-9]{1,})?[@][a-z0-9]{1,}[.][a-z]{2,3}([.][a-z]{2})?$";
    private static final String NUMBER_REGEX="^([+][0-9]{2})?[\\s]?[1-9][0-9]{9}$";
    private static final String PASSWORD_REGEX="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";

    public static void main(String[] args) {

        //Getting Input from User
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter ur number");
        String number=sc.nextLine();
        //Using Lambda for Number Validation
        //Predicate Predefined Functional Interface
        IDetails obj= (a)-> Pattern.matches(NUMBER_REGEX,a);
        if(obj.test(number).equals(true)){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Please Enter a Valid Number");
        }

        System.out.println("Enter ur First name");
        String firstName=sc.next();
        //Using Lambda for Name Validation
        //Predicate Predefined Functional Interface
        IDetails obj1= (a)-> Pattern.matches(NAME_REGEX,a);
        if(obj1.test(firstName).equals(true)){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Please Enter a Valid fName");
        }

        //Using Lambda for Name Validation
        //Predicate Predefined Functional Interface
        System.out.println("Enter ur Last name");
        String lastName=sc.next();
        if(obj1.test(lastName).equals(true)){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Please Enter a Valid LName");
        }

        //Using Lambda for Email Validation
        //Predicate Predefined Functional Interface
        System.out.println("Enter ur email");
        String email=sc.next();
        IDetails obj2= (a)-> Pattern.matches(EMAIL_REGEX,a);
        if(obj2.test(email).equals(true)){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Please Enter a Valid Email");
        }

        //Using Lambda for Password Validation
        //Predicate Predefined Functional Interface
        System.out.println("Enter ur Password");
        String password=sc.next();
        IDetails obj3= (a)-> Pattern.matches(PASSWORD_REGEX,a);
        if(obj3.test(password).equals(true)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Please Enter a Valid Password");
        }

    }
}
