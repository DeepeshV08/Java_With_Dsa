public class Question15 {
    
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i<= n ; i++){
            for(int j = 1 ; j <= n-i ;j++){
                System.out.print("  ");
            }
            for(int j = 1; j<= i ; j++){
                System.out.print((char) (j + 64)+" ");
            }
            char toPrint = (char) (i + 'A'-2);
            for(int j = 1 ; j<=i-1 ; j++){
                System.out.print(toPrint+" ");
                toPrint--;
            }
            System.out.println();
        }
    }
}
