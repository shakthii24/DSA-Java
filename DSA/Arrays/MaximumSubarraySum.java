package DSA.Arrays;
import java.util.Arrays;
/**
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * MaximumSubarraySum
 */
public class MaximumSubarraySum {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maximum = Integer.MIN_VALUE;
        int sum = 0;
        int st = -1;
        int end = -1;
        int point = 0;
        for(int i=0;i<arr.length;i++){
            
            //Track which is the starting point of the subarray
            if(sum == 0) point = i;
            sum += arr[i];

            if(maximum < sum){
                maximum = sum;
                st = point; end = i;
            }

            if(sum < 0) sum = 0;
        }

        //store the subarray elements which gives the largest sum
        int[] result = new int[end - st + 1];
        for(int j=st;j<=end;j++){
            result[j - st] = arr[j];
        }

        System.out.println("Subarray with the largest sum: " + maximum);
        System.out.println(Arrays.toString(result));
    }
}
