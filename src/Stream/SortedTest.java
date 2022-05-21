package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedTest {
    public static void main(String[] args) {
        List<String> person = Arrays.asList("Hand","Foot","Body","Face");

        person.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(x->System.out.println(x));
    }
    }

