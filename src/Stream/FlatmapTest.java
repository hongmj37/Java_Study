package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapTest {
        public static void main(String[] args) {
            String[][] namesArray = new String[][]{
                    {"kim", "taeng"}, {"mad", "play"},
                    {"kim", "mad"}, {"taeng", "play"}};

            Set<String> namesWithFlatMap = Arrays.stream(namesArray)
                    .flatMap(innerArray -> Arrays.stream(innerArray))
                    .filter(name -> name.length() > 3)
                    .collect(Collectors.toSet());
            System.out.println(namesWithFlatMap);
        }
    }
