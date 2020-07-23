// In this assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
public class Exercise1 {

    public static String highAndLow(String numbers) {
        IntSummaryStatistics summary = Arrays
                .stream(numbers.split(""))
                .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
        return String.format("%d %d", summary.getMax(), summary.getMin());
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("12345"));
    }

}
