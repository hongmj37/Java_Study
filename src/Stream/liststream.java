package Stream;
import java.util.*;
import java.util.stream.Stream;

public class liststream {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("One", "Two", "Three");
        Stream<String> lsStream = ls.stream();
        lsStream.forEach(System.out::println);
    }
}