package com.regex;

public class Registration {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    //Checking validation for String Name

    public void setFirstName(String firstName) {
        if(RegexValidation.isFirstNameValidate(firstName)){
            this.firstName = firstName;
        }
        else System.out.println("Please Enter a Valid Name");
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

//Using getter and setter

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
