package com.chapter14.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @ClassName LinkedHashSetExercise
 * @Author Oliver
 * @Date 2022/5/6 17:24
 * Description      TODO
 * @see
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet<Car> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new Car("奥托", 1000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("法拉利", 10000000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("保时捷", 70000000));
        linkedHashSet.add(new Car("奥迪", 300000));
        System.out.println(linkedHashSet);


    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
