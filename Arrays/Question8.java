import java.util.Scanner;

public class Question8 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < arr.length; idx++) {
           arr[idx] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean isMatched = false;
        int low = 0 , high = arr.length-1;
        while(low <= high){
            int mid = low+(high - low)/2;
            if(arr[mid] == target){
                isMatched = true;
                break;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(isMatched);
    }
}
