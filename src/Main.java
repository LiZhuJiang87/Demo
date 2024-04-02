import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        int[] sortedNumber = {2,7,11,15};
        int target = 9;

        int[] actual = Utility.findTwoNumbers(sortedNumber,target);
        int[] expected = new int[]{0,1};

        System.out.printf("Is the actual equal to the expected? %s%n",
                           Arrays.equals(actual,expected) ? "YES" : "NO");
    }
}