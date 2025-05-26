package Codeforces_Contest;
import java.lang.*;
import java.util.*;
 
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//https://codeforces.com/contest/2110
//https://codeforces.com/contest/2110/problem/A
public class SampleCodeforce {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
 
        while(t-->0){
 
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr); //Sorting the array to get the first even and odd number in the array.

            //Edge Case
            if(n==1){
                if(arr[0]%2==0){
                    System.out.println(0);
                }else{
                    System.out.println(0); //Due to this it is accepted in codeforces. When it was 1 it did not got accepted.
                }
            }

            if(n>=2){
                int leftOdd=0; 
                boolean leftOddFlag= true;
                int leftEven=0;
                boolean leftEvenFlag= true;
                int rightOdd=0;
                boolean rightOddFlag= true;
                int rightEven=0;
                boolean rightEvenFlag= true;

                for(int i=0;i<n;i++){
                    if(arr[i]%2==0 && leftEvenFlag){
                        leftEven=i;
                        leftEvenFlag=false;
                       
                    }
                    if(arr[i]%2!=0 && leftOddFlag){
                        leftOdd=i;
                        leftOddFlag=false;
                       
                    }
                }

                int j=0;
                for(int i=n-1;i>=0;i--){
                    if(arr[i]%2==0 && rightEvenFlag){
                        rightEven=j;
                        rightEvenFlag=false;
                       
                    }
                    if(arr[i]%2!=0 && rightOddFlag){
                        rightOdd=j;
                        rightOddFlag=false;
                       
                    }
                    j++;
                }
                
                int ans = Math.min(Math.max(leftEven, rightEven), Math.max(leftOdd, rightOdd));
                System.out.println(ans);
            }
        }
    }
}