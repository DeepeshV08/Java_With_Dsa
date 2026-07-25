import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt();
        }
        System.out.println("Before Reverse: "+Arrays.toString(arr));
        int i = 0 , j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("After Reverse: "+Arrays.toString(arr));
    }
}
