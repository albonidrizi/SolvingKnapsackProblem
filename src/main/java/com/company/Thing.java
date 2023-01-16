package com.company;

import java.util.Objects;

public class Thing {
    int price;
    int weight;

    public Thing(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return price == thing.price &&
                weight == thing.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }
}