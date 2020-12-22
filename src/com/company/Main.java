package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        zadanie 1 imię i nazwisko
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input your first name: ");
//        String fname = input.next();
//        System.out.print("Input your last name: ");
//        String lname = input.next();
//        System.out.println();
//        System.out.println("Hello \n"+fname+" "+lname);

//    zadanie 2 dodwawanie dwóch liczb
        Scanner input = new Scanner(System.in);
//        System.out.print("podaj pierwszą liczbe: ");
//        int num1 = input.nextInt();
//        System.out.print("podaj drugą liczbe: ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        float div = num1 / num2;
//        int a = -5 + 8 * 6;
//        int b = ( 55 + 9 ) % 9;
//        System.out.println("suma to: " + sum);
//        System.out.println(" wynik z dzielenia to: " + div);
//        System.out.print("wynik w: " + a + "wynik b to: " + b);

//        zadania z mnozeniem
//        System.out.println("pierwsza liczba");
//        int num1 = input.nextInt();
//        System.out.println("druga liczba");
//        int num2 = input.nextInt();
//        int disp = num1 * num2;
//        System.out.println("disp: " + disp);


//      zadanie 13 obliczenia pola prostokąta i obwodu
        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height+width);
        double area = height * width;

        System.out.printf("obwód to 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);

    }

}
