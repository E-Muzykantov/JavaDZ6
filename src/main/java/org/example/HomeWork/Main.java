package org.example.HomeWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", "Windows XP", 2500, 2, "Черный");
        Laptop l2 = new Laptop("HP", "Windows 7", 1000, 4, "Серый");
        Laptop l3 = new Laptop("HP", "Windows 10", 2000, 16, "Белый");
        Laptop l4 = new Laptop("Lenovo", "Windows 10", 1500, 8, "Синий");
        Laptop l5 = new Laptop("Asus", "Windows 11", 3000, 32, "Синий");

        List<Laptop> laptopList = new ArrayList<>(Arrays.asList(l1, l2, l3, l4, l5));
        Store store = new Store(laptopList);
        store.start();
        }
    }
