package com.company;

public class TV {
    private int number;

    private Channel channelName;

    public TV(int number, Channel channelName) {
        this.number = number;
        this.channelName = channelName;
    }

    public int returnNumber(int number){
        return number;
    }
}
