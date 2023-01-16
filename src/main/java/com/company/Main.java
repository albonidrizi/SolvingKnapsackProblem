package com.company;

public class Main {
    public static void main(String[] args) {
            Knapsack knapsack = new Knapsack(15);
            knapsack.add(new Thing(35, 8));
            knapsack.add(new Thing(44, 4));
            knapsack.add(new Thing(11, 4));
            knapsack.add(new Thing(23, 7));

            Result result = knapsack.getResult();
            System.out.println(result);
    }
}
