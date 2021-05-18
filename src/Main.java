package com.company;

public class Main {
    public static void main(String[]args) {
        for (String s : args) {
            if (isPalindrom(s))
                System.out.println(s + "Палиндром");
            else
                System.out.println(s + "Не палиндром");
        }
    }
    public static String reverseString(String s) {
        StringBuilder r= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
            r.append(s.charAt(i));
        return r.toString();
    }
    public static boolean isPalindrom(String s) {
        String r = reverseString(s);
        return s.equals(r);
    }
}

