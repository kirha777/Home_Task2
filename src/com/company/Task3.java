package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task3 {
    int happyTicket = 0;
    int num1, num2, num3, num4, num5, num6;
    void Task3(){
        System.out.println("****************** Task3: Lucky People ***********************");
        for(int i = 1001; i<1000000; i++){
            num1=i/100000%10;
            num2=i/10000%10;
            num3=i/1000%10;
            num4=i/100%10;
            num5=i/10%10;
            num6=i%10;
            if((num1 + num2 + num3)==(num4 + num5 + num6)){
                happyTicket++;
            }
        }
        System.out.println("The number of lucky ticket holders: " + happyTicket);
        System.out.println("**************************************************************");
        System.out.println();
    }
}
