package com.chapter11.homework;

/**
 * @author ooah
 * @version 1.0
 */
public class Homework06 {
    public static void main(String[] args) {

        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.common();
        tang.passRiver();
        tang.passFireHill();

    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {
    public String name = "白龙马";

    @Override
    public void work() {
        System.out.println("一般情况下骑" + name);
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("过河的时候乘船");
    }
}

class Plane implements Vehicles {
    @Override
    public void work() {
        System.out.println("过火焰山，使用飞机");
    }
}

class VehiclesFactory {
    private static Horse horse = new Horse();

    private VehiclesFactory() {
    }

    public static Horse getHorse() { // 这里我们将方法做成 static 的，比较方便
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}


class Person {
    private String name;
    private Vehicles vehicle;

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void passRiver() {
//        if (vehicle == null || vehicle instanceof Horse) {
        if (!(vehicle instanceof Boat)) {
            vehicle = VehiclesFactory.getBoat(); // 工厂可以得到一个船
        }
        vehicle.work();
    }

    public void common() {
        if (!(vehicle instanceof Horse)) {
            vehicle = VehiclesFactory.getHorse();
        }
        vehicle.work();
    }

    public void passFireHill() {
        if (!(vehicle instanceof Plane)) {
            vehicle = VehiclesFactory.getPlane();
        }
        vehicle.work();
    }

}
