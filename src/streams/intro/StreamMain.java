package streams.intro;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 32, 8, 9);

        List<Integer> integers1 = countIntegers(2, 5, integers);

        System.out.println("integers1 = " + integers1);
    }

    private static boolean test(int someInteger) {
        return someInteger == 1;
    }

    public static List<Integer> countIntegers(int firstExclusionBound, int secondExclusionBound, List<Integer> inputIntegers) {
        return inputIntegers.stream()
                .filter(integer -> integer < firstExclusionBound || integer > secondExclusionBound)
                .sorted(Integer::compare)
                .collect(Collectors.toList());
    }
}
