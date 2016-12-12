package com.company;

import java.util.Scanner;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task7 {
    //int sumNum = 0;
    int summa(int n) {
        return n < 1 ? 0 : n + summa(n - 1);
    }
    void Task7 (){
        System.out.println("********** Task7: Sum of the numbers from 1 to n *************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int Num = scanner.nextInt();
        System.out.println("The sum of numbers from 0 to n: " + summa(Num));
        System.out.println("**************************************************************");
        System.out.println();
    }
}
