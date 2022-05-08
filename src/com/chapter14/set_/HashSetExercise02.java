package com.chapter14.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @ClassName HashSetExercise02
 * Description
 * @Author haohao
 * @Date 2022/5/6 14:51
 */
public class HashSetExercise02 {
    public static void main(String[] args) {

        HashSet<Employee2> employee2s = new HashSet<>();
        employee2s.add(new Employee2("Jack", 4300, new MyDate("1997", "04", "23")));
        employee2s.add(new Employee2("Tom", 4300, new MyDate("1997", "04", "23")));
        employee2s.add(new Employee2("Marry", 4300, new MyDate("1997", "04", "23")));
        employee2s.add(new Employee2("Oliver", 4300, new MyDate("1997", "04", "23")));
        employee2s.add(new Employee2("Jack", 4300, new MyDate("1997", "04", "23")));
        employee2s.add(new Employee2("Jack", 4300, new MyDate("1998", "04", "23")));
        System.out.println(employee2s);
    }
}

class Employee2 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee2(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name, employee2.name) && Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate {
    private String year;
    private String month;
    private String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
