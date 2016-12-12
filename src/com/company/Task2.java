package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task2 {
    int [] mas;
    void Task2 (){
        System.out.println("******************** Task2: Fibonachi ************************");
        mas = new int[11];
        mas [0] = 1;
        mas [1] = 1;
        System.out.print("Fibonachi: " + mas [0] + ", " + mas [1]);
        for (int i = 2; i < 11; i++){
            mas [i] = mas [i - 2] + mas [i - 1];
            System.out.print(", " + mas[i]);
        }
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println();
    }
}
