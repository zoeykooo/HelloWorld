package com.hspdu.extend_.exercise;

public class PC extends Computer {

    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC =");
        System.out.println(getDetails()+"brand"+brand);
    }
}
