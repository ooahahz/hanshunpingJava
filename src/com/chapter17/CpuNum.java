package com.chapter17;

/**
 * @ClassName CpuNum
 * @Author Oliver
 * @Date 2022/5/12 18:28
 * Description      TODO
 * @see
 */
public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        // 获取当前电脑 CPU数量
        int i = runtime.availableProcessors();
        System.out.println("当前有cpu数目" + i);

    }
}
