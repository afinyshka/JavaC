package Seminar_9.School.Classes;

import Seminar_9.School.Interface.ISmoking;

public class HighSchool extends SchoolStudent implements ISmoking{

    @Override
    public void study() {
        System.out.println("I need to study!"); 
    }

    @Override
    public void smoke() {
        System.out.println("I smoke!"); 
    }
    
}
