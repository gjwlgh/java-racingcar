package domain;

import java.util.Scanner;

public class User {
    public static Car[] userSetting(){
        Scanner input = new Scanner(System.in) ;
        String name = input.nextLine();
        String[] playerName = name.split(",");

        int num = playerName.length;
        Car[] players = new Car[num];

        for(int i = 0; i < num; i++){
            System.out.println(playerName[i]);
            players[i]=new Car(playerName[i]);
        }
        return players;
    }
}
