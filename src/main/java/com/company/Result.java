package com.company;

import java.util.List;
import java.util.Objects;

public class Result {
    private final int value;
    private final List<Integer> takenThingsIndexes;

    public Result(int value, List<Integer> takenThingsIndexes) {
        this.value = value;
        this.takenThingsIndexes = takenThingsIndexes;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getTakenThingsIndexes() {
        return takenThingsIndexes;
    }

    @Override
    public String toString() {
        return "Resultati{" +
                "Value=" + value +
                ", TakenThingsIndexes=" + takenThingsIndexes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return value == result.value && Objects.equals(takenThingsIndexes, result.takenThingsIndexes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, takenThingsIndexes);
    }
}
