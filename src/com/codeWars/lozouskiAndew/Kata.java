package com.codeWars.lozouskiAndew;

public class Kata {
    public static void main(String[] args) {
        String middle = getMiddle("A");
        System.out.println(middle);
    }

    public static String getMiddle(String word) {
        if (word.length() == 1) return word;
        else if (word.length() % 2 == 0) return String.valueOf(word.charAt(word.length() / 2 - 1)) + word.charAt(word.length() / 2);
        else return String.valueOf(word.charAt(word.length() / 2));
    }
}