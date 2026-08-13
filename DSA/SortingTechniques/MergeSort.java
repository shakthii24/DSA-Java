package DSA.Recursion;
import java.util.*;

public class MergeSort {
    public static void mergeArray(int[] arr,int low,int mid,int high){

        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mergeSort(int[] arr,int low,int high){

        if(low == high){
            return;
        }

        //for OVERFLOW Prevention
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, mid, high);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        mergeSort(array,0,array.length-1);

        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
