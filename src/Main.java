import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        myList.add("Apple");
        myList.add("Pear");
        myList.add("Strawberry");
        myList.add("Pineapple");
        myList.add("Watermelon");

        out.println(myList.size());
        out.println(myList.get(1));
        myList.add(9, "Melon");
        out.println(myList.get(9));
        out.println(myList.add("Melon"));
        out.println(myList.contains("Melon"));
        out.println(myList.isEmpty());
    }
}
