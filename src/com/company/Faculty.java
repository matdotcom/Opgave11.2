package com.company;

public class Faculty extends Employee {
    // Variabler som definerer Faculty objekter
    public static int LECTURER = 1;
    public static int ASSISTANT_PROFESSOR = 2;
    public static int ASSOCIATE_PROFESSOR = 3;
    public static int PROFESSOR = 4;

    private String Hours;
    private int rank;

    // No arg constructor, som laver et faculty objekt.
    public Faculty()
    {
        // Standard værdien for et Faculty objekt som er lavet med denne constructor.
        this (" 8:30 - 15:45",4);
    }
    // Constructor som gør vi kan lave faculty objekter, hvor vi selv definerer timer og deres rank.
    public Faculty(String hours, int rank)
    {
    this.Hours = hours;
    this.rank = rank;
    }
// getter som henter data fra vores objekter.
    public String getRank() {
        return (rank == 1)?"Lecturer"
                : (rank == 2)?"Assistant Professor"
                : (rank == 3)?"Associate Professor"
                :"professor";
    }
    @Override
    // Tostring metode som henter data, Og returnerer dem.
    public String toString()
    {
        return (rank==1)?"Lecturer"+Hours+" I "+getOffice()
                :(rank==2)?"Assistant Professor"+Hours+" I "+getOffice()
                :(rank==3)?"Associate Professor"+Hours+" I" +getOffice()
                :"Professor"+Hours+" I "+getOffice();
    }
}
