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
//        Scanner input = new Scanner(System.in);
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
//        final double width = 5.6;
//        final double height = 8.5;
//
//        double perimeter = 2*(height+width);
//        double area = height * width;
//
//        System.out.printf("obwód to 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);

//        SUMOWANIE LICZB BINARNYCH
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print("\n");
//    }


        // WYPISYWANIE WERSJI PROGRAMU ZADANIE 31
//        System.out.println("\nJava Version: " + System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: " + System.getProperty("java.home"));
//        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");


        //cwiczenie 32 porównanie 2 liczb
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("podaj piewszą liczbę ");
        number1 = input.nextInt();
        System.out.print("podaj drugą liczbę ");
        number2 = input.nextInt();

        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );

    }
}
