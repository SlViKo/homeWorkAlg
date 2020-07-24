package lesson2;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> msal = new MyArrayList<>();
        fillArrayInt(msal);
        System.out.println(msal);


        long startTime = System.currentTimeMillis();
        msal.bubbleSort(Comparator.naturalOrder());
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Время пузырьковой сортировки: " + elapsedTime);

        msal.removeAll();
        fillArrayInt(msal);

        startTime = System.currentTimeMillis();
        msal.insertionSort(Comparator.naturalOrder());
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Время сортировкой вставками : " + elapsedTime);

        msal.removeAll();
        fillArrayInt(msal);

        startTime = System.currentTimeMillis();
        msal.selectionSort(Comparator.naturalOrder());
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println("Время сортировки выбором: " + elapsedTime);

    }



    public static void fillArrayInt(MyArrayList<Integer> msal) {
        Random rnd = new Random();
        for (int i = 0; i < 100000; i++) {
            msal.add(rnd.nextInt(1000));
        }
    }
}
