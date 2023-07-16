package org.example.HomeWork;

import java.util.List;

public class Store {
    List<Laptop> laptops;
    Filter filter = new Filter(laptops);


    public Store(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public void start (){
        System.out.println("Добро пожаловать в наш магазин ноутбуков.");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
        System.out.println("\nУ нас большой асортимент товаров, для " +
                "более удобного поиска воспользуйтесь фильтром товаров.");
        filter.startFilter();
        filter.chooseFilter(laptops);
    }
}
