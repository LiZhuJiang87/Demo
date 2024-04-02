public class Utility {


    /**
     * Since the array is sorted already, so we can use two pointers to solve this problem.
     * Time Complexity: O(n), where n is the size of the array
     * Space Complexity: O(1)
     */
    public static int[] findTwoNumbers(int[] sorted, int target) {
        int len = sorted.length;
        int left = 0, right = len - 1;
        while (left < right) {
            if (sorted[left] + sorted[right] > target) {
                right--;
            } else if (sorted[left] + sorted[right] < target) {
                left++;
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
}
