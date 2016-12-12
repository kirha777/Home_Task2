package com.company;

import java.util.Scanner;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task9 {
    void Task9 (int n){
        int count = 1;
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                count ++;
                break;
            }
        }
        if (count == 1) System.out.print(n + "\t");
        if (n > 2) Task9(n-1);
    }
}
