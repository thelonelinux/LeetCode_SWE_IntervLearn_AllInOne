package DynamicProgramming_Learning.D_Type_Others_ToExplore;

public class MinNumOfWayToCoverDistance1D {

    //This is a simple problem to find the number of ways to cover distance in 1D
    //We can cover distance in 1D by taking steps of 1, 2, or 3 units at a time.

    //We will do this by using the concept of Dynamic Programming and use memoization/iterative approach
    //We will use a 1D DP array to store the number of ways to cover distance i

    //I have attached the pdf see that. 
    //DP_Special_1D.pdf

    static int printCountDP(int dist){
        int[] dp = new int[dist+1];

        //Initialise base calues. 
        
        //There is one way to cover 0 and 1 distance. (I don't konw why for dp[0] we are taking 1)
        dp[0] = 1; //THIS IS MAIN PART TO REMEMBER OF THIS PROBLEM
        dp[1] = 1;
        //There are two ways to cover 2 distance. (1+1, 2)
        dp[2] = 2;

        //fill the dp array in bottom up manner
        for(int i=3; i<=dist; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[dist];
    }

    public static void main(String[] args) {
        int dist = 3;
        System.out.println("Number of ways to cover distance " + dist + " is: " + printCountDP(dist));
        //Output: Number of ways to cover distance 4 is: 7
        //Explanation: The possible ways are:
        //1+1+1+1
        //1+1+2
        //1+2+1
        //2+1+1
        //2+2
        //3+1
        //1+3
    }
    
}
