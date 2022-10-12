import java.util.List;
import java.util.Random;

import static java.util.stream.IntStream.rangeClosed;

public class Sort {

    public static void main(String[] args) {
        List<Integer> nums = rangeClosed(0, 10)
                .map(i -> randomInt(10))
                .boxed()
                .toList();

        System.out.println("List to sort " + nums);
        System.out.println(new Sort().sort(nums));
    }

    private static int randomInt(int bound) {
        return new Random().nextInt(bound);
    }

    public<T> List<T> sort(List<T> input) {
        return input.stream().sorted().toList();
    }
}
