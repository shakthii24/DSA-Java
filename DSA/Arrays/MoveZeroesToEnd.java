package DSA.Arrays;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,2,0,0,3,0,4,5,0,6};

        int i = -1;

        for(int n=0;n<arr.length;n++){
            if(arr[n] == 0){
                i = n;
                break;
            }
        }

        if(i<0){
            System.out.println("There is no zero in the array.");
            return;
        }

        int j = i + 1;
        while(j<arr.length){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
