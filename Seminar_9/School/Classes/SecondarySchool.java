package Seminar_9.School.Classes;

import Seminar_9.School.Interface.IPlaying;
import Seminar_9.School.Interface.ISkiping;

public class SecondarySchool extends SchoolStudent implements IPlaying, ISkiping{

    @Override
    public void play() {
        System.out.println("I hate studying!"); 
    }

    @Override
    public void study() {
        System.out.println("I play Minecraft!");
    }

    @Override
    public void skip() {
        System.out.println("I skip classes!");
    }
    
}
