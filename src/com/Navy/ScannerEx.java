package com.Navy;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner test= new Scanner(System.in);
        System.out.println("Enter the number:");
        System.out.println("The number is:" + test.nextInt());
        System.out.println("Enter a float value:" );
        float f= test.nextFloat();
        System.out.println(f+10);
        System.out.println("Enter a Byte value:" );
        byte b= test.nextByte();
        System.out.println(b*8);
        System.out.println("Enter a Long value:" );
        long l= test.nextLong();
        System.out.println(l/3);
        System.out.println("Enter a Boolean value:" );
        boolean bo= test.nextBoolean();
        System.out.println("Enter the Sentence:");
        Scanner str = new Scanner(System.in);
        System.out.println("The Sentence says:" + str.nextLine());
    }
}
