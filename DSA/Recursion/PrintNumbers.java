package DSA.Recursion;
import java.util.Scanner;

public class PrintNumbers {
    public static void printNums(int i, int num){
        if(i>num){
            return;
        }
        System.out.print(i + " ");
        printNums(i+1, num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printNums(1,N);
    }
}
