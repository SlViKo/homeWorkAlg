package Lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(5,"five");
        map.put(1,"one");
        map.put(3,"three");
        map.put(2,"two");

        System.out.println(map);
        System.out.println(map.get(2));
        map.put(2,"ttt");
        System.out.println(map);

        map.deleteMin();
        System.out.println(map);


        MyTreeMap[] myTreeMaps = new MyTreeMap[20];

        Random rnd = new Random();

        for (int i = 0; i < myTreeMaps.length; i++) {
            myTreeMaps[i] = new MyTreeMap<Integer, String>();
            do {
                myTreeMaps[i].put(rnd.nextInt( 200)-100, "авв");
            } while (myTreeMaps[i].height() <= 2);
        }

        int countBalanced = 0;

        for (int i = 0; i <myTreeMaps.length ; i++) {
            if(myTreeMaps[i].isBalanced()) {
                countBalanced++;
            }
        }

//        MyTreeMap<Integer, Integer> testIsBalansed = new MyTreeMap<>();
//
//        testIsBalansed.put(15, 4);
//        System.out.println(testIsBalansed.isBalanced());
//        testIsBalansed.put(9, 4);
//        System.out.println(testIsBalansed.isBalanced());
//        testIsBalansed.put(16, 4);
//        testIsBalansed.put(7, 4);
//        testIsBalansed.put(10, 4);
//        testIsBalansed.put(11, 4);
//        testIsBalansed.put(16, 4);
//       testIsBalansed.put(12, 4);
//       // testIsBalansed.put(12, 4);
//
//        System.out.println(testIsBalansed.height());
//        System.out.println(testIsBalansed.isBalanced());

        int degreeBalancedTree = countBalanced*100/myTreeMaps.length;

        System.out.println("процент сбалансированных деревьев: " + degreeBalancedTree);

    }
}
