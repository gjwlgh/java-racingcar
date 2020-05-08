package domain;

import java.util.Random;

public class Car {
    private final String name;
    private int position = 0;
    Random random = new Random();

    public Car(String name) {
        this.name = name;
    }

    public void name(){
        System.out.print(name);
    }

    public void moveOutput(){
        System.out.printf(name);
        System.out.printf(" : ");
        for(int i = 0; i < position; i++){
            System.out.printf("-");
        }
        System.out.printf("\n");
    }
    
    public void Move(){
        if(random.nextInt(9)>=4){
            position++;
        }
    }

    public int distance(){
        return position;
    }
}