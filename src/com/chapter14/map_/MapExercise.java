package com.chapter14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapExercise
 * @Author Oliver
 * @Date 2022/5/7 16:32
 * Description      TODO
 * @see
 */
public class MapExercise {
    public static void main(String[] args) {

        HashMap<Object, Object> employees= new HashMap<>();
        Employee hh = new Employee("韩红", 40000, "54666");
        employees.put(hh.getId(), hh);
        Employee zf = new Employee("张飞", 5000, "12345");
        employees.put(zf.getId(), zf);
        Employee jack = new Employee("Jack", 40001, "43344");
        employees.put(jack.getId(), jack);

        // 第一种遍历方式
        Set keyset = employees.keySet();
        // (1) 增强for
        for (Object key : keyset) {
            // 先获取 value
            Employee o = (Employee) employees.get(key);
            if (o.getSalary() > 30000) {
                System.out.println(key + " " + o );
            }
        }

        // (2) 迭代器
        System.out.println("--------迭代器----------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key  + " " + employees.get(key) );
        }

        // 第二种方法: 使用 EntrySet
        // (1)
        System.out.println("------------使用EntrySet-------------");
        Set<Map.Entry<Object, Object>> entries = employees.entrySet();
        System.out.println("----------增强for--------------------");
        for (Object obj : entries) {
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " " +  entry.getValue());
        }
        // (2) 迭代器
        System.out.println("-------------迭代器-------------------");
        Iterator<Map.Entry<Object, Object>> itera = entries.iterator();
        while (itera.hasNext()) {
            Map.Entry<Object, Object> entry = itera.next();
            System.out.println(entry.getClass()); // HashMap$Node
            Employee emp = (Employee) entry.getValue();
            if (emp.getSalary() > 30000) {
                System.out.println(emp);
            }
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private String id;

    public Employee(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }
}
