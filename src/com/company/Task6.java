package com.company;

/**
 * Created by Eremenko on 09.12.2016.
 */
public class Task6 {
    int [][] mas;
    int [] pr;
    int ppr;
    int maxpr = 0;
    int rowNum = 0;
    void Task6(){
        System.out.println("******************** Task6: Random array2 ********************");
        mas = new int[7][4];
        pr = new int [7];
        Randomizer rnd = new Randomizer();
        for (int i = 0; i < 7; i++){
            ppr = 1;
            for (int j = 0; j < 4; j++){
                mas [i][j] = rnd.Randomizer(-5, 5) ;
                ppr *=mas[i][j];
                System.out.print("\t" + mas [i][j] + "\t");
            }
            pr [i] = Math.abs(ppr);
            if (pr[i] > maxpr) {
                maxpr = pr[i];
                rowNum = i;
            }
            System.out.println();
        }
        System.out.println("Row index with the largest absolute value the product of the elements: " + rowNum);
        System.out.println("**************************************************************");
        System.out.println();
    }
}
