package com.company;
import java.util.Scanner;

public class RemoteController {
    private boolean isOn;
    private int keys;

    private TV tv;

    public RemoteController(boolean isOn) {
        this.isOn = isOn;
    }

    boolean tvPower(){
        this.isOn = true;
        return true;
    }
}
