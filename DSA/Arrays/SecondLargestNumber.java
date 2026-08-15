package DSA.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    if(size < 2){
        System.out.println("Array size must be atleast 2.");
        return;
    }

    int[] arr = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }

    int largest = arr[0];
    int secondLargest = Integer.MIN_VALUE;

    for(int j=1;j<arr.length;j++){
        if(arr[j] > largest){
            secondLargest = largest;
            largest = arr[j];
        }else if(arr[j] < largest && arr[j] > secondLargest){
            secondLargest = arr[j];
        }
    }

    System.out.println("Largest element in this array is: " + largest);
    if(secondLargest == Integer.MIN_VALUE){
        System.out.println("There is no second largest number in this array.");
    }else{
        System.out.println("Second largest element in this array is: " + secondLargest);
    }
    
  }
}
