package domain;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter the name of the car you want to race (name separated by commas)");

        Car[] players = User.userSetting();

        System.out.println("How many attempts do you have?");

        int num = players.length;
        int[] distances = Output.carCurrentStatus(players,num);

        Output.winners(players,distances,num);

    }
}
