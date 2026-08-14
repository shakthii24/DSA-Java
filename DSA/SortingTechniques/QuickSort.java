package DSA.SortingTechniques;
import java.util.Scanner;

public class QuickSort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int left = low;
        int right = high;

        while(left<right){
            while(left<=right && arr[left]<=pivot){
                left++;
            }
            
            while(right>=left && arr[right]>pivot){
                right--;
            }

            if(left<right){
                swap(arr,left,right);
            }
        }

        swap(arr,low,right);

        return right;
    }

    public static void quickSort(int [] arr,int low,int high){
        if(low>=high) return;

        int mid = partition(arr,low,high);

        quickSort(arr,low,mid-1);
        quickSort(arr,mid+1,high);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        quickSort(array,0,array.length-1);

        for(int num : array){
            System.out.print(num + " ");
        }
    }
}
