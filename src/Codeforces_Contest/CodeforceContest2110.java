package Codeforces_Contest;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Stack;

public class CodeforceContest2110 {

    public static String goodString(String str) {

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==')' && str.charAt(i+1)=='('){
                return "YES"; //if we find ) ( then we can return YES  
            }
        }
        
        return "NO"; //if we do not find any ) ( then we return NO

        //(((()())))

        //Very best worst case
    }

    public static boolean isBalanced(String str) {
        String newStr = str.substring(1, str.length() - 1); // Remove first and last character
        Stack<Character> stack = new Stack<>();
        for (char ch : newStr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int t=sc.nextInt();
 
        
        String[] arr = new String[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<t;i++){
           // System.out.println(goodString(arr[i]));
           boolean result = isBalanced(arr[i]);
           if(!result) {
               System.out.println("YES");
              } else {
               System.out.println("NO");
              }
           // System.out.println(isBalanced(arr[i]));
        }
        sc.close();
        

     }
    
}
/**
 * 4
(())
(())()()
()
(())(())

 */
