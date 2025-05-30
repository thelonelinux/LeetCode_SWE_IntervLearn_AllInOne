package Competitive_Programming.CodeChef_Learning_Tips_GK;

public class SieveOfEratothens {

    //This is same code as prime sieve, only here we are calculating only required number of prime
    //you have asked us until N, and not preparing a whole list of prime numbers

    // Java program to print all primes smaller than or equal to
    // n using Sieve of Eratosthenes
       public static void sieveOfEratosthenes(int n)   {
            // Create a boolean array "prime[0..n]" and initialize
            // all entries it as true. A value in prime[i] will
            // finally be false if i is Not a prime, else true.
            boolean prime[] = new boolean[n+1];
            for(int i=0;i<=n;i++)
                prime[i] = true;

            for(int p = 2; p*p <=n; p++)
            {
                // If prime[p] is not changed, then it is a prime
                if(prime[p] == true)
                {
                    // Update all multiples of p
                    for(int i = p*p; i <= n; i += p)
                        prime[i] = false;
                }
            }

            // Print all prime numbers
            for(int i = 2; i <= n; i++)
            {
                if(prime[i] == true)
                    System.out.print(i + " ");
            }
        }

        // Driver Program to test above function
        public static void main(String args[])
        {
            int n = 30;
            System.out.print("Following are the prime numbers ");
            System.out.println("smaller than or equal to " + n);
            sieveOfEratosthenes(n);
        }




}
