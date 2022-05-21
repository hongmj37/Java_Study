package Stream;

import java.util.Arrays;
import java.util.List;


public class MapTest {
    public static void main(String[] args) {
        List<String> coffee = Arrays.asList("americano", "caffe latte" ,"cappuccino");
        coffee.stream()
                .map(x -> x.toLowerCase())
                .forEach(x->System.out.println(x));
    }
}
