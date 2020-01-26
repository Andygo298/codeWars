package com.codeWars.lozouskiAndew;

public class GrassHopper {
    public static void main(String[] args) {
        int sum = summation(5);
        System.out.println(sum);
    }
    public static int summation(int n) {
        int sum = 1;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
