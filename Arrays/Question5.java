
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i = 0 ; i<arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
