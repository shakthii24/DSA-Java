package DSA.Arrays;
import java.util.*;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1,1,2,3,4,4,4,5};
        int[] arr2 = {5,6,7,8,8,8,8,9};

        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(list.isEmpty() || list.get(list.size()-1) < arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                    if(list.isEmpty() || list.get(list.size()-1) < arr2[j]){
                        list.add(arr2[j]);
                    }
                    j++;
            }
        }
        
        while(i < arr1.length){
            if(list.get(list.size()-1) < arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(list.get(list.size()-1) < arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        System.out.println(list);
    }
}
