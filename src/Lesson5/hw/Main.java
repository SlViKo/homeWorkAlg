package Lesson5.hw;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcDegree(3, 7));

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("первый", 5 ,500));
        items.add(new Item("второй", 3 ,450));
        items.add(new Item("третий", 2 ,50));
        items.add(new Item("четвертый", 1 ,100));
        items.add(new Item("пятый", 7 ,250));
        items.add(new Item("шестой", 6 ,350));
        items.add(new Item("седьмой", 4 ,450));
        items.add(new Item("восьмой", 4 ,180));
        items.add(new Item("девятый", 5 ,600));
        items.add(new Item("десятый", 6 ,370));

        Backpack backpack = new Backpack(15);
        backpack.searchBestSet(items);
        System.out.println(backpack.getBestSetItems());
    }

    public static int calcDegree(int number, int degree) {
        if(degree == 0) {
            return 1;
        }
        if(degree % 2 == 0) {
            return calcDegree(number, degree/2)*calcDegree(number, degree/2);
        } else {
            return number * calcDegree(number, degree-1);
        }
    }

}
