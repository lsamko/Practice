import static java.lang.System.out;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        ArrayList<String>myList2 = new ArrayList<>();
        myList2.add("Berry");
        out.println(myList2);

        myList.add("Apple");
        myList.add("Pear");
        myList.add("Strawberry");
        myList.add("Pineapple");
        myList.add("Watermelon");
        myList.remove("Strawberry");

        myList.clear();
        out.println(myList.get(4));
        out.println(myList.size());


    }
}
