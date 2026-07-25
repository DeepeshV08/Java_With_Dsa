import java.util.Scanner;

public class Question4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[]arr =new int[5];
        for(int i =0; i< arr.length ;i++){
            arr[i]=sc.nextInt();
        }

        boolean isSorted = true;

        for(int i = 0;i< arr.length -1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
}
