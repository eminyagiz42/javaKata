package com.codekata.hackerrank.daysofcode.first10.day2;


import java.io.IOException;

public class Day2 {

    public static void main(String[] args) throws IOException {
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
        Result.solve(meal_cost, tip_percent, tax_percent);
        bufferedReader.close();
                 */
        //Result.solve(12.00, 20, 8);
        Result.solve(10.25, 17, 5);
    }
}

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        final double totalCost = meal_cost + calculate(meal_cost, tip_percent) + calculate(meal_cost, tax_percent);
        System.out.println((int) Math.round(totalCost));
    }

    public static double calculate(double cost, double percentage) {
        return (cost / 100) * percentage;
    }

}