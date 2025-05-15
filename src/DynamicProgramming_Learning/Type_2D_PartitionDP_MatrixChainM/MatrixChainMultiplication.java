package DynamicProgramming_Learning.Type_2D_PartitionDP_MatrixChainM;

public class MatrixChainMultiplication {

        static int matrixMultiplication(int arr[]) {
            // code here
            int n=arr.length;
            
            int[][] dp = new int[n][n];
            for(int len = 2; len<n; len++){
               
                for(int row=0; row<n-len; row++){ //row is lower range of taken length (like i)
                
                    int col=row+len; //Upper Range of taken len (like j)
                    
                    dp[row][col]= Integer.MAX_VALUE;
                    for(int  k = row+1; k<col;k++){
                        
                        dp[row][col] = Math.min(dp[row][col], 
                                                dp[row][k]+dp[k][col]+arr[row]*arr[k]*arr[col]);
                    }
                   
                }
            }
            
            return dp[0][n-1];
        } 


        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4};
            System.out.println(matrixMultiplication(arr)); //Expected 18
            //Explanation: 1*2*3*4 = 24, 1*2*4 = 8, 2*3*4 = 24, 1*3*4 = 12, so min is 18
        }
    
    
}
