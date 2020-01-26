package com.codeWars.lozouskiAndew;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
SeriesSum(1) => 1 = "1.00"
SeriesSum(2) => 1 + 1/4 = "1.25"
SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 */
public class NthSeries {
    public static void main(String[] args) {

        String text = seriesSum(40);
        System.out.println(text);
    }

    public static String seriesSum(int n) {
        double x = 1.00;
        double result = 1.00;
        if (n == 0) return "0.00";
        else if (n == 1) return String.format("%.2f", result);
        else {
            for (double i = 2, y = 4; i <= n; i++, y += 3) {
                result += x / y;
            }
            return String.format("%.2f", result);
        }
    }
}
