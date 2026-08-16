package DSA.Arrays;
import java.util.Scanner;

public class LeftRotateArrayBy_K_Positon {
    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
   public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);

    System.out.println("Enter the size of array: ");
    int size = sc.nextInt();
    
    if(size<1){
        System.out.println("Array must contain atleast 1 element.");
        return;
    }

    System.out.println("Enter the array elements: ");
    int[] arr = new int[size];
    for(int n=0;n<size;n++){
        arr[n] = sc.nextInt();
    }

    System.out.println("How many positions you want to rotate the array by left: ");
    int k = sc.nextInt();
    k = k % size;

    reverse(arr,0,k-1);
    reverse(arr,k,arr.length-1);
    reverse(arr,0,arr.length-1);

    System.out.println("----Rotated array----");
    for(int num : arr){
        System.out.print(num + " ");
    }

   }
}
