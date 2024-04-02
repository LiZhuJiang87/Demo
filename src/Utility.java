public class Utility {

    public static int[] findTwoNumbers(int[] sorted, int target)
    {
        int len = sorted.length;
        int left=0,right=len-1;
        while(left < right)
        {
            if(sorted[left]+sorted[right]>target)
            {
                right--;
            }
            else if(sorted[left]+sorted[right]<target)
            {
                left++;
            }
            else
            {
                return new int[]{left,right};
            }
        }
        return new int[]{};
    }
}
