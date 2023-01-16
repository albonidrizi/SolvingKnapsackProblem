package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class KnapsackTest {
    @Test
    @DisplayName("Testing algorithm")
    void checkResultOfAlgorithm() {
        Knapsack knapsack = new Knapsack(10);
        knapsack.add(new Thing(10, 5));
        knapsack.add(new Thing(40, 4));
        knapsack.add(new Thing(30, 6));
        knapsack.add(new Thing(50, 3));
        Result result = knapsack.getResult();

        Result expectedResult = new Result(90, Arrays.asList(2, 4));
        Assertions.assertEquals(expectedResult, result);
    }
}
