package com.fth.ocp17.chapters.ch1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

class Person {

    // these are fileds
    private int id;
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private String address;


    private void showInfo() {
        System.out.println("Person name: "+firstname);
        System.out.println("Person lastname: "+lastname);


        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);

        cal.setTime(dateOfBirth);
        int yearOfBirth = cal.get(Calendar.YEAR);


        System.out.println("Person age: "+(year-yearOfBirth));
    }

    public static void main(String[] args)  {


        // String... args
        // String args[]


        Person p = new Person();
        Course c = new Course();
        p.firstname = "abuzer";
        p.lastname = "kömürcü";
        String sDate1="31/12/1998";
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date1=formatter1.parse(sDate1);
            p.dateOfBirth = date1;
        } catch(Exception e) {
            e.printStackTrace();
        }

        p.showInfo();

    }




    // School Management System
    // Person : Student, Instructor, Stuff,
    // Course
    // Exam







}

class Course {

}
