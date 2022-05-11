package com.chapter15.generic;

/**
 * @ClassName Mydate
 * @Author Oliver
 * @Date 2022/5/11 15:32
 * Description      TODO
 * @see
 */
public class Mydate implements Comparable<Mydate> {
    private int month;
    private int day;
    private int year;

    public Mydate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Mydate o) {
        // 把对年月日比较放在这里
        int yearMinus = this.year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        // 如果年相同，就比较 month
        int monthMinus = this.month - o.getMonth();
        if (monthMinus != 0) {
            return monthMinus;
        }
        // 如果月相同，就比较 天
        return this.day - o.getDay();

    }
}

