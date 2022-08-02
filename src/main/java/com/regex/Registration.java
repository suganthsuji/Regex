package com.regex;

public class Registration {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String address;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    //Checking validation for String Name

    public void setFirstName(String firstName) {

        try{
            if(RegexValidation.isFirstNameValidate(firstName)){
                this.firstName=firstName;
            }
            else throw new CustomException("Invalid Name");

        }
        catch (Exception e){
            System.out.println(e);
        }


    }

    public String getLastName() {
        return lastName;
    }

    //Checking Validation for Last name
    public void setLastName(String lastName) {

        if(RegexValidation.isLastNameValidate(lastName)){
            this.lastName = lastName;
        }
        else System.out.println("Please Enter a Valid Name");
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(RegexValidation.isEmailValidation(email)){
            this.email = email;
        }
        else System.out.println("Please Enter a Valid Email");

    }

//Using getter and setter

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(RegexValidation.isNumberValidation(number)){
            this.number = number;
        }
        else System.out.println("Please Enter a Valid Number");


    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //using getter and setter for password
    public String getPassword() {
        return password;
    }
    //checking validation for passord
    public void setPassword(String password) {
        if(RegexValidation.isPasswordValidation(password)){
            this.password = password;
        }
        else System.out.println("Please Enter a Valid Password");
    }

    //Beautify using toString method
    @Override
    public String toString() {
        return "Registration{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
