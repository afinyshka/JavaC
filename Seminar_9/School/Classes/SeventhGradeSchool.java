package Seminar_9.School.Classes;

import Seminar_9.School.Interface.ISkiping;
import Seminar_9.School.Interface.ISmoking;

public class SeventhGradeSchool extends SchoolStudent implements ISmoking, ISkiping{

    @Override
    public void study() {
        System.out.println("I don't like studying!");
    }

    @Override
    public void smoke() {
        System.out.println("I smoke!");
    }

    @Override
    public void skip() {
        System.out.println("I skip classes!");
        
    }

    
}
