import java.util.Scanner;

public class Question3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[]arr =new int[5];
        for(int i =0; i< arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int  secondLargest = Integer.MIN_VALUE;

        for(int val: arr){
            if(val>largest){
                secondLargest = largest;
                largest=val;
            }
            else if(val>secondLargest && val != largest){
                secondLargest = val;
            }
        }
        System.out.println(secondLargest);
    }
}