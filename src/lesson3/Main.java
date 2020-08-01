package lesson3;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        for (int i = 0; i < 4; i++) {
            System.out.println(stack.pop());
        }
//
//        Expression e = new Expression("(4-6)+[{67+45} * {a / b}]");
//        System.out.println(e.checkBracket());
//
//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//
//        System.out.println(queue);
//
//        for (int i = 0; i < 3 ; i++) {
//            System.out.println(queue.remove());
//        }

        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>(8, Comparator.naturalOrder());

        mpq.insert(5);
        mpq.insert(1);
        mpq.insert(7);
        mpq.insert(4);
        mpq.insert(2);

        System.out.println(mpq);
        for (int i = 0; i < 5; i++) {
            System.out.println(mpq.remove());
        }


        String word = "asdfasdf";
        System.out.println(reverse(word));

        MyDeque<Integer> myDeque = new MyDeque<>(7);

        myDeque.insertLeft(4);
        myDeque.insertRight(6);
        myDeque.insertRight(3);

        System.out.println(myDeque.popLeft());
        System.out.println(myDeque.popLeft());
        System.out.println(myDeque.popLeft());

    }


    // П.1 Переворот строки
    private static String reverse(String word) {
        MyStack<Character> letters = new MyStack<Character>(word.length());

        for (int i = 0; i < word.length(); i++) {
            letters.push(word.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!letters.isEmpty()) {
            sb.append(letters.pop());
        }
        return sb.toString();

    }
}
