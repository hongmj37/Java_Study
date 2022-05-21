package Stream;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<String> sick = Arrays.asList("두통","근육통","고열","복통","근육통");
        sick.stream()
                .distinct()
                .forEach(n -> System.out.println(n));

        System.out.println();

        sick.stream()
                .filter( x -> x.startsWith("두"))
                .forEach(x-> System.out.println(x));

    }
}
