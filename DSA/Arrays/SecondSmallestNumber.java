package DSA.Arrays;
import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if(size < 2){
            System.out.println("Array size must be atleast 2.");
            return;
        }

        int[] arr = new int[size];
        for(int j=0;j<size;j++){
            arr[j] = sc.nextInt();
        }

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=1;i<size;i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]>smallest && arr[i]<secondSmallest){
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest number in this array is: " + smallest);
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("There is no second smallest number in this array.");
        }else{
            System.out.println("Second smallest number in this array is: " + secondSmallest);
        }
        
    }
}
