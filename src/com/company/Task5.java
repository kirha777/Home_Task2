package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task5 {
    int [][] mas;
    void Task5(){
        System.out.println("******************** Task5: Random array *********************");
        mas = new int[8][5];
        Randomizer rnd = new Randomizer();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                mas [i][j] = rnd.Randomizer(10, 99) ;
                System.out.print(mas [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**************************************************************");
        System.out.println();
    }
}
