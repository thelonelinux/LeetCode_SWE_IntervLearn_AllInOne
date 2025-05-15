package DynamicProgramming_Learning.C_Type_2D_PartitionDP_MatrixChainM;

public class BurstBalloon {
    
    public static int maxSkill(int[] arr) {
        // code here
        //Let say array contains [5, 1, 3, 8]
        //Initially
        //[0, 1, 2, 3]index => n=4
        //[5, 1, 3, 8]value
        int n=arr.length;
        int[] newArr= new int[n+2]; //Because we need to add 1 at 0th index and n+1 index.
        
        newArr[0]=1;
        newArr[n+1]=1;
        
        //rest of the value of arr will be added from index 1 to n
        for(int i=1;i<=n;i++){
            newArr[i]=arr[i-1];
        }
        
        //so now our new array becomes : [1, 5, 1, 3, 8, 1]
        //But our main content is only as this prescribed way [1, [5, 1, 3, 8], 1]
        
        //Let's create our 2D DP array to store the sub-problems 
        //which later is used to solve the bigger problems
        
        int[][] dp = new int[n+2][n+2]; //for now just keeping it as n+2 to avoid any indexOutOfBound Later
        
        //Now our concept is that instead of picking the first element
        //We will first pick the last element we want to burst
        //and the remaining sub-problems on the left or right of array we will get from dp
        
        //We don't want to pick or burst in first as there we can't removed its dependency on adjacent balloons
        
        //We are doing in last pick/burst so to remove the dependency of it's adjacent element or say
        //to remove dependency on it's left and right sub-array
        
        //So the code concept is same as we did and learn in MCM
        
        //CODE CONCEPT
        //1. First we want the length, means taken length of size 1 , and then size 2 and .... size n
        //So for this we have first loop of for loop to get the length in which we want to store our sub-problem
        //in dp
        
        
        for(int length=1; length<=n; length++){
            //[0(0th index, [1, 2, 3, 4(nth index)], 5]
            //[1          , [5, 1, 3, 8           ], 1]
            //so we we are keeping length to be from 1 to 4 only. Here n=4 so
            //We only want to traverse this [5, 1, 3, 8]  so.
            
            //CODE CONCEPT
            //2. Now we want to have range in which we want to solve. So length we take from above
            //and then first and last or say left and right element we will pick accordingly of above length
            //so we have second for loop as below
            
            for(int left=1; left<=n-length+1; left++){
                //[5, 1, 3, 8]
                //Here left can be from 5 to 8
                //But at some scenario if length =2, and we don't want left to hit 8 (4th or nth index)
                //Then it will throw index out of bound exception and goes to last 1 element
                //so to resolve that issue we will have
                //instead of left<=n
                //we will have left<=n-length+1; This I come up by just thinking if length = 1 then only
                //it will neutralize to get till 4th index by putting +1 so I did and -length.
                //Otherwise in some case it will go indexOutOfBound
                
                //for example here //[5, 1, 3, 8]
                //If we have length=4 means taken from 5 to 8 all the element
                //so left should have only 1 time loop, i.e. when left=1; left<=4-4+1;left++
                //which comes as left=1; left=1; left++,
                //So this will run only one time as expected.
                
                
                //Now we set the upper range or say right ending.
                //You know it should be never above the value 8 or say 4th index i.e nth index.
                //so J or Right should be written as
                
                int right = (left + length) - 1;  //right-left=0=length-1 (when length=1 means i==j or right==left)
                //Just tried using case length=1, and we can have both i and j pointing to same index
                //So taken 1 at a time works for this question dp. so compe up with above value for right.
                
                //Now let's take some initial value for our dp
                //Remember this is working same as we did in MCM, here just we can take 1 at a time as well.
                //i.e. i and j can be pointing to same as length 1 means something here.
                
                dp[left][right] = Integer.MIN_VALUE;
                //Since we are to find max value, so even we get 0, it is max only.
                
                
                
                //CODE CONCEPT 
                //3. Like MCM, here we have K. but the concept is 
                //here K is acting as partition, logically means if that Kth index if burst at last
                //Means the right subarray and left subarray are already burst
                //Means just get the dp[rightSubarray]+dp[leftSubArray]+and then added them to this 
                //last burst element. so K is literraly that.
                //so this is the whole concept.
                
                //Also when we burst the last element k then it's burst value we will get is
                //newArr[left-1] * newArr[last] * newArr[right+1].
                //Here left-1 taken because that is only left if left and right subarray are burst before 
                //our last burst element.
                //same way we have taken right+1.
                //so add this value to the left and right subarray. 
                
                
                //So our for loop will look like this of moving K(partition/as Last Burst element) in the 
                //taken range of taken length and storing the values of small sub-problem 
                //in our 2d DP array.
                
                
                for(int last=left; last<=right; last++){
                    //Since k will touch [5, 1, 3, 8] all of this element and not only middle to burst
                    //In this it is different to MCM, as here it can have 5 and 8 as well.
                    
                    //So now lets' come to our dp formula and store our sub-problems
                    //later to be used by bigger problem when length become n.
                    
                    dp[left][right]= Math.max(dp[left][right],
                                        dp[left][last-1] + dp[last+1][right] + 
                                          newArr[left-1] * newArr[last] * newArr[right+1]);
                                          
                    //Rem - Here newArr[right+1] will give at very end which is 8
                    //in new array it's index is 4th
                    //[0(0th index, [1, 2, 3, 4(nth index)], 5]   ;;newArr[5] upto here it works
                    //[1          , [5, 1, 3, 8           ], 1]
            
                }
                
            }
            
        }
        //Now once we come out of this 3 for loop our answer will be stored in the dp of arr
        //DP[leftValueMinTaken=1][rightValueUptoWhereOurActualDataIs=n+1th Index]
        //[5(1st Index, 1, 3, 8 (nth Index)]   from 5 i.e. 1st index of newArr and upto 8 i.e. n+1th index of newArr.
        //This is what length of higher sub-problem we were tryint to get more smaller sub-problem
        //This means taken from 1st index to n index to get it's answer using smaller sub-problem
        return dp[1][n];
        
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 8};
        System.out.println(maxSkill(arr)); // Output: 167
        // Explanation: The optimal way to burst the balloons is to burst them in the order of 1, 3, 5, and 8.
        // The maximum skill level achieved is 167.
        
        // You can test with other inputs as well
        int[] arr2 = {1, 2, 3};
        System.out.println(maxSkill(arr2)); // Output: 9
    }
}
