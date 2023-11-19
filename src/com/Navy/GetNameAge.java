package com.Navy;

import java.util.Scanner;

public class GetNameAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Kindly enter your name:");
        System.out.println("Please enter your age:");
        System.out.println("Hiii " + input.next() + " Your age is " + input.nextInt());
    }
}
