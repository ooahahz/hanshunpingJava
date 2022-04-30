package com.chapter10.extend_.exercise;

class Computer {
    private String CPU;
    private int memory;
    private int hardDisk;

    public Computer() {

    }

    public Computer(String CPU, int memory, int hardDisk) {
        this.CPU = CPU;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    // 返回Computer详细信息
    public String getDetails() {
        return "cpu = " + CPU + " memory = " + memory + " hardDisk = " + hardDisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
}
