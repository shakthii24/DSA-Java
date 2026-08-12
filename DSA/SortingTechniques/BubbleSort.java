package DSA.SortingTechniques;

public class BubbleSort {
    public static void bubbleSort(int[] arr,int n){
        
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {13,46,24,52,20,9};

        bubbleSort(arr,arr.length);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
