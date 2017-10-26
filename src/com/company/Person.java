package com.company;

public class Person
{
    // En getter, som er en metode som gør det muligt at hente navnet på et objekt.
    public String getName() {
        return name;
    }
// Person variabler. Bruges at constructoren.
    private String name;
    private String adress;
    private String phoneNumbr;
    private String email;

    public Person(){
        this (" Mathias", " Naestved", " 12345678", "WHatever@gmail.com");
    }
// En arg constructor som gør vi kan oprette Person objects, med de ovenstående variabler.
    public Person(String name, String adress, String phoneNumbr, String email){
        this.name = name;
        this.adress = adress;
        this.phoneNumbr = phoneNumbr;
        this.email = email;
}
// Tostring metode som gør det muligt at hente data fra vores person objekt.
@Override
    public String toString(){
        return " Name " + name
                + "\nAdress" + adress
                + "\nPhonenumber" + phoneNumbr
                + "\nEmail" + email;
}

    public String getEmail() {
        return email;
    }

    public String getPhoneNumbr() {
        return phoneNumbr;
    }
}
