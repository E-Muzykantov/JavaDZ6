package org.example.HomeWork;

import java.util.*;

public class Filter {
    List<Laptop> laptops;
    Scanner scanner = new Scanner(System.in);
    public Filter(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void startFilter() {
        System.out.println("Выберите соответствующую критерию:\n"
                + "1 - Бренд \n"
                + "2 - Операционная система \n"
                + "3 - Объем ЖД \n"
                + "4 - ОЗУ \n"
                + "5 - Цвет");
    }

    public int enter() {
        System.out.println("Ведите число: ");
        int scan = scanner.nextInt();
        return scan;
    }

    public void chooseFilter(List<Laptop> laptops){

        switch (enter()){
            case 1:
                brandFiler(laptops);
                break;
            case 2:
                osFilter(laptops);
                break;
            case 3:
                hddFilter(laptops);
                break;
            case 4:
                ramFilter(laptops);
                break;
            case 5:
                colorFilter(laptops);
                break;
            default:
                System.out.println("Вы не выбрали ни один из критериев, повтоите ввод: ");
                chooseFilter(laptops);
        }
    }

    public void colorFilter(List<Laptop> laptops) {
        Set<String> colorSet = new HashSet<>();
        for (Laptop laptop : laptops) {
            colorSet.add(laptop.getColor());
        }
        List<String> colorList = new ArrayList<>(colorSet);
        int i = 0;
        for (String s : colorList) {
            System.out.println(++i + " - " + s);
        }
        System.out.println("Для выбора цвета ведите соответствующее число: ");
        int scan = scanner.nextInt();
        if (scan <= colorList.size() && scan > 0) {
            System.out.println("Варианты ноутбуков соответствующие вашему критерию: ");
            for (Laptop laptop : laptops) {
                if (laptop.getColor().equals(colorList.get(scan - 1))) {
                    System.out.println(laptop);
                }
            }
        }else {
            System.out.println("Вы не выбрали ни один из критериев, повтоите ввод: ");
            colorFilter(laptops);
        }
        scanner.close();
    }

    public void ramFilter(List<Laptop> laptops) {
        System.out.println("Введите минимальное значение объема оперативной памяти: ");
        int scan = scanner.nextInt();
        List<Laptop> ramList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRam() >= scan) {
                ramList.add(laptop);
            }
        }
        if (scan >= 0) {
            System.out.println("Варианты ноутбуков соответствующие вашему критерию: ");
            Collections.sort(ramList, Comparator.comparingInt(x -> x.getRam()));
            for (Laptop laptop : ramList) {
                System.out.println(laptop);
            }
        }else {
            System.out.println("Объем оперативной памяти не может быть меньше 0, повтоите ввод: ");
            ramFilter(laptops);
        }
        scanner.close();
    }

    public void hddFilter(List<Laptop> laptops) {
        System.out.println("Введите минимальное значение объема жесткого диска: ");
        int scan = scanner.nextInt();
        List<Laptop> hddList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getHdd() >= scan) {
                hddList.add(laptop);
            }
        }
        if (scan >= 0) {
            System.out.println("Варианты ноутбуков соответствующие вашему критерию: ");
            Collections.sort(hddList, Comparator.comparingInt(x -> x.getHdd()));
            for (Laptop laptop : hddList) {
                System.out.println(laptop);
            }
        }else {
            System.out.println("Объем жесткого диска не может быть меньше 0, повтоите ввод: ");
            hddFilter(laptops);
        }
        scanner.close();
    }

    public void osFilter(List<Laptop> laptops) {
        Set<String> osSet = new HashSet<>();
        for (Laptop laptop : laptops) {
            osSet.add(laptop.getOs());
        }
        List<String> osList = new ArrayList<>(osSet);
        int i = 0;
        for (String os : osList) {
            System.out.println(++i + " - " + os);
        }
        System.out.println("Для выбора операционной системы ведите соответствующее число: ");
        int scan = scanner.nextInt();
        if (scan <= osList.size() && scan > 0) {
            System.out.println("Варианты ноутбуков соответствующие вашему критерию: ");
            for (Laptop laptop : laptops) {
                if (laptop.getOs().equals(osList.get(scan - 1))) {
                    System.out.println(laptop);
                }
            }
        }else {
            System.out.println("Вы не выбрали ни один из критериев, повтоите ввод: ");
            osFilter(laptops);
        }
        scanner.close();
    }

    public void brandFiler(List<Laptop> laptops) {
        Set<String> brandSet = new HashSet<>();
        for (Laptop laptop : laptops) {
            brandSet.add(laptop.getBrand());
        }
        List<String> brandList = new ArrayList<>(brandSet);
        int i = 0;
        for (String s : brandList) {
            System.out.println(++i + " - " + s);
        }
        System.out.println("Для выбора бренда ведите соответствующее число: ");
        int scan = scanner.nextInt();
        if (scan <= brandList.size() && scan > 0) {
            System.out.println("Варианты ноутбуков соответствующие вашему критерию: ");
            for (Laptop laptop : laptops) {
                if (laptop.getBrand().equals(brandList.get(scan - 1))) {
                    System.out.println(laptop);
                }
            }
        }else {
            System.out.println("Вы не выбрали ни один из критериев, повтоите ввод: ");
            brandFiler(laptops);
        }
        scanner.close();
    }
}

