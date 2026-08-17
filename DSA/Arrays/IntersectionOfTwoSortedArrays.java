package DSA.Arrays;
import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++; j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }

        System.out.println(list);
    }
}
