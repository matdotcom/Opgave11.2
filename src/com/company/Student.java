package com.company;

public class Student extends Person {

    // Variabler som definerer en student
    public static int FRESHMAN = 1;
    public static int SOPHMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;

    private int status;
    // No arg constructor som default sætter et student objekt der laves med denne constructor til at være freshman.
    public Student()
    {
        this(1);
    }
    // 1 arg constructor som gør at vi kan lave et student objekt og sætte deres status.
    public Student(int status)
    {
        this.status = status;
    }
    // toString metode, som gør at vi kan hente vores student objekts status.
    @Override
    public String toString()
    {
        return (status == 1)? getName() + " Is a freshman."
                : (status == 2)? getName() + "Is a sophmore."
                : (status == 3)? getName() + "Is a junior."
                : getName() + "Is a senior";
    }
}
