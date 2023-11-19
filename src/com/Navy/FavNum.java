package com.Navy;

import java.util.Scanner;

public class FavNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favorite integer:");
        int favoriteNumber = input.nextInt();
        System.out.println(favoriteNumber + " is my favorite integer too!");
    }
}
