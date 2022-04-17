package com.hspedu.homework.homework9;

public class LabeledPoint extends Point{
    // 特有属性
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
}
