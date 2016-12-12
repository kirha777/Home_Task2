package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task4 {
    int revHour;
    void Task4(){
        System.out.println("**************** Task4: Symmetrical time *********************");
        for(int hour = 0; hour < 24; hour++){
            for(int minute = 0; minute <=59; minute++){
                if ((hour/10%10 == minute%10) & (hour%10 ==minute/10%10)){
                    revHour++;
                }
            }
        }
        System.out.println("The number of symmetric combinations: " + revHour);
        System.out.println("**************************************************************");
        System.out.println();
    }
}
