package com.regex;

import java.util.regex.Pattern;

public class RegexValidation {

    //Validation method for Name using Regexz
    public static boolean isFirstNameValidate(String firstName){

        String nameRegex="^[A-Z][a-z]{3,}$";
        if(Pattern.matches(nameRegex,firstName)){
            return true;
        }
        else{
            return false;
        }
    }
    //Validation method for Name using Regex
    public static boolean isLastNameValidate(String lastName){

        String nameRegex="^[A-Z][a-z]{3,}$";
        if(Pattern.matches(nameRegex,lastName)){
            return true;
        }
        else{
            return false;
        }
    }
    //Validation method for Email using Regexz
    public static boolean isEmailValidation(String email){

        String emailRegex="^[a-z0-9]{3,}([.][a-z0-9]{1,})?[@][a-z]{3,}[.][a-z]{2,3}([.][a-z]{2})?$";
        if(Pattern.matches(emailRegex,email)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isNumberValidation(String number){

        String numberRegex="^([+][0-9]{2})?[\\s][1-9][0-9]{9}$";
        if(Pattern.matches(numberRegex,number)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPasswordValidation(String password){

        String passwordRegex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,10}$";
        if(Pattern.matches(passwordRegex,password)){
            return true;
        }
        else{
            return false;
        }
    }
}
