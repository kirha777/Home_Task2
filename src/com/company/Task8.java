package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task8 {
    int count = 0;
    int fibon (int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        if (i == 4) count ++;
        return fibon(i - 1) + fibon(i - 2);
    }
    void Task8(){
        System.out.println("************* Task8: Re-calculate a fourth element  **********");
        fibon(15);
        System.out.println("The fourth element is necessary to calculate the " + count + " times");
        System.out.println("**************************************************************");
        System.out.println();
    }
}
