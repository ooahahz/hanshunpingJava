package com.hspedu.abstract_;

public class BB extends Template {


    @Override
    public void job() {
        long num = 1;
        for (int i = 1; i < 800000; i++) {
            num *= i;
        }
    }
}
