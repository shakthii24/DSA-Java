package DSA.Arrays;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3,4,4,5,5,6};
        
        int i = 0;
        int j = 1;

        while(j < arr.length){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
            j++;
        }

        i++;
        while(i < arr.length){
            arr[i] = -1;
            i++;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
