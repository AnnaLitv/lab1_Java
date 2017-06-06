package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");//ввести число n
        float n = in.nextFloat();
        System.out.println("Enter m");//вести число m
        float m = in.nextFloat();
        float s = 0.0F;

        //вычисление выражения
        for(float i = 0.0F; i <= n; ++i) {
            if (i!=1)
                for(float j = 1.0F; j <= m; ++j) {
                    s += i / j / (i - 1.0F);
                }
        }

        System.out.print("Sum: ");
        System.out.print(s);
    }
}
