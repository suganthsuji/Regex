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
    //Validation method for Name using Regexz
    public static boolean isLastNameValidate(String lastName){

        String nameRegex="^[A-Z][a-z]{3,}$";
        if(Pattern.matches(nameRegex,lastName)){
            return true;
        }
        else{
            return false;
        }
    }
}
