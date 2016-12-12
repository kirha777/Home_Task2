package com.company;

import java.util.Scanner;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task1 {
    int summa = 0;
    void Task1() {
        System.out.println("***************** Task1: Sum of digits number ****************");
        System.out.print("Enter n:  ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number != 0) {
            summa += (number % 10);
            number /= 10;
        }
        System.out.println("Summa = " + summa);
        System.out.println("**************************************************************");
        System.out.println();
    }
}