package org.example.HomeWork;

public class Laptop {
    private String brand;
    private String os;
    private Integer hdd;
    private Integer ram;
    private String color;


    public Laptop(String brand, String os, Integer hdd, Integer ram, String color) {
        this.brand = brand;
        this.os = os;
        this.hdd = hdd;
        this.ram = ram;
        this.color = color;
    }

    public Laptop() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "brand: " + brand +
                ", os: " + os +
                ", hdd: " + hdd +
                ", ram: " + ram +
                ", color: " + color;
    }
}
