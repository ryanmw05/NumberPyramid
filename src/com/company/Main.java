package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number you want added to the pyramid");
        int number = input.nextInt();
        for(int i2 = 0; i2 < number; i2++){
            for (int i = 0; i < number; i++ ){
                System.out.print(i + 1);
            }
            System.out.println(i2 + 1);
        }

    }
}
