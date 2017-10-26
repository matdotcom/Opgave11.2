package com.company;

public class Employee extends Person {
    public String getOffice() {
        return office;
    }

    // variabler som definerer en employee
    private String office;
    private double salary;
    private MyDate datehired;

    // No arg constructor.
    public Employee()
    {
        this (" Næstved ", 450000.70, new MyDate());
    }
    // Constructor med argumenter
    public Employee(String office, double salary, MyDate datehired)
    {
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }
    // toString metoden, som gør at vi kan hente data fra objektet lavet med constructoren ovenover.
    @Override
    public String toString()
    {
        return "Office:" + office
                + "Salary:" + salary
                +"Date Hired: " + datehired
                +"\n"+ super.toString();
    }
}
