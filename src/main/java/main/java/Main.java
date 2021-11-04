package main.java;

import java.util.List;
import main.java.MyArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>(0);

        List<String> fruits = List.of("pear", "apple", "banana");
        myList.addAll(fruits);

        System.out.println("myList = " + myList);

        myList.add(1, "grape");

        System.out.println("myList = " + myList);
    }
}
