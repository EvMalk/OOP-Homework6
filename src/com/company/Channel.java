package com.company;

import java.util.Random;

public class Channel {
    private Program[] programs;
    private String chanelName;
    private TV tv;
    private int number;

    public Channel(Program[] programs, String chanelName) {
        this.programs = programs;
        this.chanelName = chanelName;
    }

    public Channel() {
    }
    Random random = new Random();


    public String getChanelName(TV number) {
        return chanelName;
    }

    public void getPrograms(Program[] programs){
        for(int i = 1; i < programs.length; i++){
            System.out.println(" ________________________________________");
            System.out.println("|                                       |");
            System.out.println("|  Now on air: " + programs[random.nextInt(2)].getProgramName());
            System.out.println("|                                       |");
            System.out.println("|                                       |");
            System.out.println("|                                       |");
            System.out.println("|                                       |");
            System.out.println("|_______________________________________|");
        }
    }

}


