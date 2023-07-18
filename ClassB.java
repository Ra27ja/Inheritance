//Author: Raja
//Date: 30/06/2023

package Reusability;


import java.util.Scanner;

public class ClassB extends ClassA{
    public static void main(String[] args) {
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Enter Second Number : ");
        Scanner sc1 = new Scanner(System.in);
        double b = sc.nextDouble();

        double Multiplied_number = methodA(a,b);

        System.out.println("Multiplied Number is: "+Multiplied_number);


    }
}
