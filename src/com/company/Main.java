package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Task1 t1 = new Task1();
        t1.Task1();
        Task2 t2 = new Task2();
        t2.Task2();
        Task3 t3 = new Task3();
        t3.Task3();
        Task4 t4 = new Task4();
        t4.Task4();
        Task5 t5 = new Task5();
        t5.Task5();
        Task6 t6 = new Task6();
        t6.Task6();
        Task7 t7 = new Task7();
        t7.Task7();
        Task8 t8 = new Task8();
        t8.Task8();
        System.out.println("****************** Task9: Prime numbers **********************");
        System.out.print("Enter n:  ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        Task9 t9 = new Task9();
        System.out.print("List of primes:  ");
        t9.Task9(number);
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println();
        System.out.println("***************** Task10: the Tower of Hanoi *****************");
        System.out.print("Input the number of discs: ");
        int discNum = scan.nextInt();
        Task10 t10 = new Task10();
        t10.Task10(discNum, 'A', 'B', 'C');
        System.out.println("**************************************************************");
    }
}
