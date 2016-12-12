package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task10 {
    char a, b, c; // наименование стержней
    void Task10(int n, char a, char b, char c){
        if (n > 0) {
            Task10(n-1, a, c, b);
            System.out.println("Disk " + n + " moves from " + a + " to " + b);
            Task10(n-1, c, b, a);
        }
    }
}
