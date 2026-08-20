package DSA.Arrays;
import java.util.*;

public class LongestSubarrayWithGivenSumK {
    public static void main(String[] args){
        int arr[] = {3, 4, -7, 2, 2, 5, -5, 3};
        int k = 5;

        Map<Integer,Integer> map = new HashMap<>();

        int maxLength = 0;
        int prefixSum = 0;

        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum - k)){
                maxLength = Math.max(maxLength, (i - map.get(prefixSum - k)));
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }

        System.out.println(maxLength);
    }
}
