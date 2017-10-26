package com.company;
import java.util.Calendar;
import java.util.GregorianCalendar;

// snød lidt med denne klasse, da jeg ikke er helt føler jeg er i stand til at lave den selv.
// Programmet kan godt køres uden, men så skriver den bare klassenavn@Randomshit
public class MyDate {
    private int year, month, day;
    public MyDate()
    {
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime)
    {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(long elapsedtime)
    {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedtime);
        year = date.get(Calendar.YEAR);
        month = date.get(Calendar.MONTH);
        day = date.get(Calendar.DAY_OF_MONTH);
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String toString()
    {
        return getMonth()+ "/" + getDay() + "/" + getYear();
    }
}
