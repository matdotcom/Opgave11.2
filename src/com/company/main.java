package com.company;

public class main
{
    public static void main(String[] args) {

        // Her bruger vi default constructoren som genererer mig.
        //Person Mathias = new Person();
        //System.out.println(Mathias.toString());
       // Her bruger vi default constructoren igen som siger jeg er freshman, da det er default.
       // Person Mathias = new Student();
        //System.out.println(Mathias.toString());
        //Person Mathias = new Employee();
        //System.out.println(Mathias.toString());
        //Person Mathias = new Faculty();
        //System.out.println(Mathias.toString());
        Person Mathias = new Staff();
        System.out.println(Mathias.toString());
        Mathias = new Student();
        System.out.println(Mathias.toString());
        Mathias = new Employee();
        System.out.println(Mathias.toString());
        Mathias = new Faculty();
        System.out.println(Mathias.toString());
        System.out.println(Mathias.getEmail()+ ""+ Mathias.getPhoneNumbr());
    }
}
