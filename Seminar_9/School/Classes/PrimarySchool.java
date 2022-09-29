package Seminar_9.School.Classes;

import Seminar_9.School.Interface.IPlaying;

public class PrimarySchool extends SchoolStudent implements IPlaying {

    @Override
    public void study() {
        System.out.println("I like stydying!");
    }

    @Override
    public void play() {
        System.out.println("I play with my toys!");
    }

 
}
