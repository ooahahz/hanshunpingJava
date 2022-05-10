package com.chapter14.homeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName HomeWork02
 * @Author Oliver
 * @Date 2022/5/9 16:04
 * Description      TODO
 * @see java.util.ArrayList
 */
@SuppressWarnings("all")
public class HomeWork02 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        cars.add(car);
        cars.add(car2);
        cars.add(new Car("奥托", 3000));
        cars.add(new Car("奥迪", 200000));

        cars.remove(car);
        System.out.println(cars);

        System.out.println(cars.contains("car"));

        System.out.println(cars.size());

        System.out.println(cars.isEmpty());

//        cars.clear();

//        System.out.println(cars.addAll(cars));
        System.out.println(cars.containsAll(cars));

        cars.removeAll(cars); // 相当于清空


        // 增强 for 循环
        System.out.println("========增强for循环=======");
        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("=========迭代器===========");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car c = iterator.next();
            System.out.println(c);
        }
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
