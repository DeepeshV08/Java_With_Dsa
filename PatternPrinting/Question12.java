public class Question12 {
    
    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i<= n ; i++){
            for(int j = 1; j<= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j+" ");
            }
            int row = i;
            int decVal = row-1;
            for(int j = 1 ; j<= row-1 ; j++){
                System.out.print(decVal+" ");
                decVal--;
            }
            System.out.println();
        }
    }
}
