import java.util.Scanner;

public class Question7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean isMatched = false;
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] == target){
                isMatched = true;
                break;
            }
        }
        System.out.println(isMatched);
    }
}
