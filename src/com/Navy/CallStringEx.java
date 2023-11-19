package com.Navy;

public class CallStringEx {
    public static void main(String[] args) {
        String s1 ="Hello";
        s1.toUpperCase();
        System.out.println(s1.toUpperCase());
        String s2="BYE BYE";
        System.out.println(s2.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s2.isEmpty());
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.concat(" " +
                "World"));
    }
}
