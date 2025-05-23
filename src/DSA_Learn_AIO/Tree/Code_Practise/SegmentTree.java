package DSA_Learn_AIO.Tree.Code_Practise;

/**
 * Segment Tree implementation in Java for Range Maximum Query.
 * Supports efficient range maximum queries and point updates in O(log n) time.
 */

public class SegmentTree {

     // Build the segment tree recursively
    public static void build(int[] arr, int[] segmentTree, int l, int r, int idx) {
        if (l == r) {
            segmentTree[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr,segmentTree, l, mid, 2 * idx + 1);
        build(arr, segmentTree, mid + 1, r, 2 * idx + 2);
        segmentTree[idx] = Math.max(segmentTree[2 * idx + 1], segmentTree[2 * idx + 2]);
    }

    // Query max value in range [ql, qr]
    public static int queryMax(int[] segmentTree, int ql, int qr, int n) {
        return queryMaxUtil(segmentTree, 0, 0, n - 1, ql, qr);
    }

    public static int queryMaxUtil(int[] segmentTree, int idx, int l, int r, int ql, int qr) {
        // No overlap
        if (qr < l || ql > r) {
            return Integer.MIN_VALUE;
        }
        // Complete overlap
        if (ql <= l && r <= qr) {
            return segmentTree[idx];
        }
        // Partial overlap
        int mid = (l + r) / 2;
        int left = queryMaxUtil(segmentTree, 2 * idx + 1, l, mid, ql, qr);
        int right = queryMaxUtil(segmentTree, 2 * idx + 2, mid + 1, r, ql, qr);
        return Math.max(left, right);
    }

    // Update value at position pos to newVal. when adding new value at index pos
    // and updating the segment tree
    public static void update(int pos, int newVal, int n, int[] segmentTree) {
        updateUtil(segmentTree, 0, 0, n - 1, pos, newVal);
    }

    public static void updateUtil(int[] segmentTree, int idx, int l, int r, int pos, int newVal) {
        if (l == r) {
            segmentTree[idx] = newVal;
            return;
        }
        int mid = (l + r) / 2;
        if (pos <= mid) {
            updateUtil(segmentTree, 2 * idx + 1, l, mid, pos, newVal);
        }
        else {
            updateUtil(segmentTree, 2 * idx + 2, mid + 1, r, pos, newVal);
        }
        // Update the current node
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
