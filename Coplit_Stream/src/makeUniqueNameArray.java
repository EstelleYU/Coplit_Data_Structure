import java.util.stream.Stream;;
import java.util.Arrays;
import java.util.List;

public class makeUniqueNameArray {
    public static void main(String[] args){
        List<String> names = Arrays.asList("유하경", "서영호", "김정우", "김코딩");
//        Stream<String> stream6 = names.stream().sorted();
//        stream6.forEach(System.out::println);
//        Object[] output = names.stream().sorted().toArray();
//        System.out.println(Arrays.toString(output));

        return names.stream()              // reference
                .distinct()                // 중복을 제거합니다.
                .sorted()                 // 정렬합니다.
                .toArray(String[]::new);



//        Stream<String> stream1 = names.stream();  // list를 Stream으로
//        Object[] output = names.sorted().toArray();  // 사전순정렬하여 Array로
//        return output;

    }
}
