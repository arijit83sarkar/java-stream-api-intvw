import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(24, 45, 29, 30, 122, 25, 98, 63, 73, 45, 54, 60, 22, 36, 58);

        int max = integerList.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(max);

        Integer _max= integerList.stream()
            .reduce((num1,num2)->num1>num2?num1:num2).get();
        System.out.println("Max :: "+_max);

        int min = integerList.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(min);

        Integer _min=integerList.stream()
            .reduce((num1,num2)->num1<num2?num1:num2).get();
        System.out.println("Min ::: "+_min);
    }
}
