package Stream;
import java.util.*;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        String[] arr = new String[]{"하나","둘","셋"};

        Stream<String> arrStream = Arrays.stream(arr);
        arrStream.forEach(x -> System.out.print(x + " "));

        System.out.println();

        Stream<String> arrSteam2 = Arrays.stream(arr,1,2);
        arrSteam2.forEach(y -> System.out.print(y + " "));

        System.out.println();

        Stream<Double> st = Stream.of(4.3,2.4,2.9);
        st.forEach(System.out::println);
    }
}
