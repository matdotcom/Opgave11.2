package com.company;

public class Staff extends Employee {
private String Title;
public Staff()
{
    this("Pedel");
}
public Staff(String title)
{
    this.Title = title;
}

    public String getTitle() {
        Faculty emp = new Faculty();
        return emp.getRank();
    }
    @Override
    public String toString()
    {
        return getName()+"'s title is "+ getTitle();
    }
}
