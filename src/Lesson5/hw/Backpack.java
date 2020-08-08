package Lesson5.hw;

import java.util.ArrayList;


public class Backpack {

    private ArrayList<Item> items;

    private double maxWeight;
    private double bestPrice;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    //расчет веса набора предметов
    private double calcWeight(ArrayList<Item> items) {
        double result = 0;
        for (Item item:
             items) {
            result += item.getWeight();
        }
        return result;
    }

    //расчет цены набора предметов
    private double calcPrice(ArrayList<Item> items) {
        double result = 0;
        for (Item item :
                items) {
            result += item.getPrice();
        }
        return result;
    }

    //проверка является ли новый набор предметов дороже предыдущего
    private void checkSet(ArrayList<Item> items) {
        if(this.items == null && calcWeight(items) <= maxWeight ) {
            this.items = items;
            bestPrice = calcPrice(items);
        } else {
            if((calcWeight(items) <= maxWeight) && (calcPrice(items) > bestPrice)) {
                this.items = items;
                bestPrice = calcPrice(items);
            }
        }
    }


    // перестановка всех наборов элементов с проверкой на лучших из них
    public void searchBestSet(ArrayList<Item> items) {
        if(items.size() > 0) {
            this.checkSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<>(items);
            newSet.remove(i);
            searchBestSet(newSet);
        }
    }

    public String getBestSetItems() {
        return items.toString();
    }
}
