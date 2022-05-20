package com.chapter19.outputstream_;

import java.io.Serializable;

/**
 * @ClassName Master
 * @Author Oliver
 * @Date 2022/5/20 11:46
 * Description      TODO
 * @see
 */
public class Master implements Serializable {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
