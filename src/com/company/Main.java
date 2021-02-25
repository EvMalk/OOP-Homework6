package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program[] newsPrograms = new Program[]{new Program("Вести"), new Program("Честные выборы")};
        Program[] funPrograms = new Program[]{new Program("ComedyClub"), new Program("Dom2")};
        Program[] sportPrograms = new Program[]{new Program("English Premier League: Arsenal - Chelsea"),
                new Program("Final Champions League: Real Madrid - Rubin Kazan")};

        Channel news24 = new Channel(newsPrograms, "News24");
        Channel fun = new Channel(funPrograms, "Fun");
        Channel sport = new Channel(sportPrograms, "SportTV");
        Channel channel = new Channel();

        TV ones = new TV(1, news24);
        TV twice = new TV(2, fun);
        TV third = new TV(3, sport);

        RemoteController power = new RemoteController(false);

        System.out.println("Please, push the button - 0, for start watching TV");
        int on = scanner.nextInt();
        if(on == 0){
            power.tvPower();
        }else{
            System.out.println("Goodbye");
            System.exit(0);
        }

        System.out.println("Please select the channel:");
        System.out.println("1. News24");
        System.out.println("2. FunChannel");
        System.out.println("3. SportTV");
        System.out.println("0. TV is off");
        int number = scanner.nextInt();
        while(number != 0) {
            if (number == 1) {
                System.out.println("On TV:" + " " + news24.getChanelName(ones));
                news24.getPrograms(newsPrograms);
                break;
            } else if (number == 2) {
                System.out.println("On TV:" + " " + fun.getChanelName(twice));
                fun.getPrograms(funPrograms);
                break;
            } else if (number == 3) {
                System.out.println("On TV:" + " " + sport.getChanelName(third));
                sport.getPrograms(sportPrograms);
                break;
            } else if (number == 0) {
                System.out.println("Goodbye");
                System.exit(0);
            } else if (number < 0 || number > 3) {
                System.out.println("Channel" + " " + number + " " + "is not exist. Please get support from your operator");
                number = scanner.nextInt();
            }
        }







    }
}
