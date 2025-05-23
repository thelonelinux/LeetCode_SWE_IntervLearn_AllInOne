package DSA_Learn_AIO.Tree.Code_Practise;

/**
 * Fenwick Tree (Binary Indexed Tree) implementation in Java.
 * Supports efficient prefix sum queries and point updates in O(log n) time.
 * Useful for problems involving range sum queries and updates.
 */
public class FenwickTreeForRangeSum {
   
   //FUNCTION 1
    // Update the value at index 'idx' by 'delta'
    //Point update, see youtube video saved for how they are updated as each index in bit[] is denoting some range.
    //For each index it will update the bit. so for whole array below we are creating at the beginning.
    //Later when we have to update any index we will just update the bit[] and not the original array.
    public static void update(int idx, int delta, int[] bit, int n) {
        idx++; // Convert to 1-based index
        while (idx <= n) {
            bit[idx] += delta;
            idx += idx & -idx; // Move to parent
        }
    }

    //FUNCTION 2
    // Get prefix sum from 0 to idx. Sum of arr[0] to arr[idx]
    // See youtube video on how sum is calculated for each index by calling the parent index to get the required sum.
    // For each index it will call the parent index to get the sum of that index.
    public static int query(int idx, int[] bit) {
        idx++; // Convert to 1-based index
        int sum = 0;
        while (idx > 0) {
            sum += bit[idx];
            idx -= idx & -idx; // Move to parent
        }
        return sum;
    }

    //FUNCTION 3
    // Get sum of range [l, r]
    public static int rangeQuery(int l, int r, int[] bit) {
        return query(r, bit) - query(l - 1, bit);
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 0, 7, 8, 3, 2, 6, 2}; // Initial array

        int n= arr.length;
        
        int[] bit = new int[n+1]; // Binary Indexed Tree array (1-based indexing)//// 1-based indexing so taken n+1

        // Build Fenwick Tree
        for (int i = 0; i < arr.length; i++) {
            update(i, arr[i], bit, n);
        }

        // Query prefix sum up to index 5 (sum of arr[0] to arr[5])
        System.out.println("Prefix sum up to index 5: " + query(5, bit)); // Output: 26

        // Update index 3 by adding 5 (arr[3] += 5)
        update(3, 5, bit, n);

        // Query prefix sum up to index 5 again
        System.out.println("Prefix sum up to index 5 after update: " + query(5, bit )); // Output: 31

        // Query sum in range [2, 6]
        System.out.println("Sum from index 2 to 6: " + rangeQuery(2, 6, bit)); // Output: 26
    }
}

/*
Explanation:
- The Fenwick Tree allows you to efficiently update an element and get prefix sums.
- update(idx, delta): Adds 'delta' to arr[idx].
- query(idx): Returns the sum of arr[0] to arr[idx].
- rangeQuery(l, r): Returns the sum of arr[l] to arr[r].
*/