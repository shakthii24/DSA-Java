package DSA.Arrays;

//Find the element which occurs n/2 times.
public class MajorityElement {
    public static void main(String[] args){
    int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};

    //Moore's voting algorithm
    int element = 0;
    int count = 0;
    for(int i : arr){
        if(count == 0){
            element = i;
        }

        count += (element == i) ? 1 : -1;
    }
    System.out.println(element);
    }
}
