package Seminar_9.School.Classes;

import Seminar_9.School.Interface.IPlaying;

public class SecondarySchool extends SchoolStudent implements IPlaying{

    @Override
    public void play() {
        System.out.println("I hate studying!");
        
    }

    @Override
    public void study() {
        System.out.println("I play Minecraft!");
    }

    public void skip() {
        System.out.println("I skip classes!");
    }
    
}
