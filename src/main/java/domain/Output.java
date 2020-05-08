package domain;

import java.util.Arrays;
import java.util.Scanner;

public class Output {
    public static int[] carCurrentStatus(Car[] players,int num){
        Scanner input = new Scanner(System.in) ;

        int attempts = input.nextInt();
        int[] distances = new int[num];

        for(int j = 0; j < attempts; j++) {
            for(int i = 0; i < num; i++){
                players[i].Move();
                distances[i]=players[i].distance();
            }
            System.out.println("Execution result");
            for (int i = 0; i < num; i++) {
                players[i].moveOutput();
            }
        }
      return distances;
    }

    public static void winners(Car[] players, int[] distances, int num){
        Arrays.sort(distances,0,num);

        int max = distances[num-1];

        for(int i = 0; i < num; i++){
            if(players[i].distance() == max && i != num-1){
                players[i].name();
                System.out.print(",");
                continue;
            }
            if(players[i].distance() == max && i == num-1){
                players[i].name();
            }
        }
        System.out.println(" win");
    }
}
