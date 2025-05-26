package DSA_Learn_AIO.Tree.Code_Practise;

/**
 * Segment Tree implementation in Java for Range Maximum Query.
 * Supports efficient range maximum queries and point updates in O(log n) time.
 */

public class SegmentTreeForMax {

     // Build the segment tree recursively
    public static void build(int[] arr, int[] segmentTree, int l, int r, int idx) { 
        // l is zero left index and r is n-1 right index, idx is the current index in segment tree.
        // l and r are the range of the current segment tree node, idx is the index in the segment tree array.
        if (l == r) { //Means we are at a leaf node (denoting single element and not range). Just store the value of array present at that index l or r. and return. 
            segmentTree[idx] = arr[l]; //this case is only for leaf node.
            return;
        }
        int mid = (l + r) / 2;
        build(arr,segmentTree, l, mid, 2 * idx + 1); //move to left child
        build(arr, segmentTree, mid + 1, r, 2 * idx + 2);//move to right child
        segmentTree[idx] = Math.max(segmentTree[2 * idx + 1], segmentTree[2 * idx + 2]);//store the max of both children. this is for only parent node. not for leafe node.
    }

    // Query max value in range [ql, qr]
    public static int queryMax(int[] segmentTree, int ql, int qr, int n) {
        return queryMaxUtil(segmentTree, 0, 0, n - 1, ql, qr);
    }

    public static int queryMaxUtil(int[] segmentTree, int idx, int nl, int nr, int ql, int qr) {  //nl and nr are the range of the segment tree NODE (left and right), ql and qr are the query range.
       
        // Type 1 - No overlap. Like we want to query the range [2, 8](ql, qr) and the current node represents the range [0, 1] or [10 ,11](l,r). 
        //So here we return a value that will not affect the max.
        if (qr < nl || ql > nr) {
            return Integer.MIN_VALUE;
        }
        // Type 2 - Complete overlap. Like we want to query the range [2, 8](ql,qr) and the current node represents the range [2, 8] or [4, 7](nl,nr). So here we return the value stored in the segment tree.
         // This is the case when the current node's range is completely within the query range.
        if (ql <= nl && nr <= qr) { //There will be very rarely case when ql == nl and qr == nr. So we can return the value stored in the segment tree.
            return segmentTree[idx]; //This is mostly useful to fill left and right as in type 3 we will be calling this function again.
        }
        // Type 3 - Partial overlap. Like we want to query the range [2, 8] and the current node represents the range [0, 3]. So here we need to go deeper in the node
        // and check the left and right children.
        int mid = (nl + nr) / 2;
        int left = queryMaxUtil(segmentTree, 2 * idx + 1, nl, mid, ql, qr); 
        int right = queryMaxUtil(segmentTree, 2 * idx + 2, mid + 1, nr, ql, qr);
        return Math.max(left, right);
    }


    // Update value at position pos to newVal. when adding new value at index 'pos'
    // and updating the segment tree
    //Only the affected nodes will be updated, so the time complexity is O(log n).
    public static void update(int pos, int newVal, int n, int[] segmentTree) {
        //here you can also update the original array if you want, but here we are only updating the segment tree.
        updateUtil(segmentTree, 0, 0, n - 1, pos, newVal);
    }

    //Update is not done in the striver video we are looking. Check some other youtube vidoe for update.
    //However the code is same as queryMaxUtil, just we here do check if that pos lies in which child node and update that node only. Not go to both child.
    public static void updateUtil(int[] segmentTree, int idx, int l, int r, int pos, int newVal) {
        if (l == r) {
            segmentTree[idx] = newVal; //first we will find and update the value at the leaf node, if it lies in the range of that node.
            //(LEAF NODE IS WHERE WE STORE ACTUAL VALUE OF THAT INDEX, REST ARE ALL RANGES)
            return;
        }
        int mid = (l + r) / 2; //Then according to the position we will go to the left or right child. and update the value of affected nodes.
        if (pos <= mid) { //We will not here move to both the child nodes, here we will only move to the child node which is affected by the update.
            updateUtil(segmentTree, 2 * idx + 1, l, mid, pos, newVal);//left child
        }
        else {
            updateUtil(segmentTree, 2 * idx + 2, mid + 1, r, pos, newVal);//right child
        }
        // Update the current node. After updating the leaf node, we need to update the parent nodes as well with the new max value.
        segmentTree[idx] = Math.max(segmentTree[2 * idx + 1], segmentTree[2 * idx + 2]);
    }

     // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int n = arr.length;

        //build the segment tree
        int[] segmentTree = new int[4 * n]; // Safe size for segment tree
        build(arr, segmentTree, 0, n - 1, 0);

        // Query max in range [1, 4]
        System.out.println("Max in range [1, 4]: " + queryMax(segmentTree, 1, 4, n)); // Output: 9

        // Update index 2 to value 10
        update( 2, 10, n , segmentTree);

        // Query max in range [1, 4] after update
        System.out.println("Max in range [1, 4] after update: " + queryMax(segmentTree, 1, 4, n)); // Output: 10
    }
    
}

/*
Explanation:
- The segment tree is built recursively, each node stores the max value in its range.
- queryMax(ql, qr): Returns the maximum value in the range [ql, qr].
- update(pos, newVal): Updates the value at index pos to newVal and updates the tree.
- Both operations run in O(log n) time.
*/
