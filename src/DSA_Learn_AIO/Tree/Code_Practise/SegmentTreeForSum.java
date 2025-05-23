package DSA_Learn_AIO.Tree.Code_Practise;

public class SegmentTreeForSum {

    // Build the segment tree
    public static void build(int[] arr, int[] segmentTree, int l, int r, int idx) {
        if (l == r) {
            segmentTree[idx] = arr[l];
            return;
        }
        int mid = (l + r) / 2;
        build(arr, segmentTree, l, mid, 2 * idx + 1);
        build(arr, segmentTree, mid + 1, r, 2 * idx + 2);
        segmentTree[idx] = segmentTree[2 * idx + 1] + segmentTree[2 * idx + 2];
    }

    // Query sum in range [ql, qr]
    public static int querySum(int[] segmentTree, int l, int r, int ql, int qr, int idx) {
        // No overlap
        if (qr < l || ql > r) return 0;
        // Complete overlap
        if (ql <= l && r <= qr) return segmentTree[idx];
        // Partial overlap
        int mid = (l + r) / 2;
        int left = querySum(segmentTree, l, mid, ql, qr, 2 * idx + 1);
        int right = querySum(segmentTree, mid + 1, r, ql, qr, 2 * idx + 2);
        return left + right;
    }

    // Update value at position pos to newVal
    public static void update(int[] segmentTree, int l, int r, int pos, int newVal, int idx) {
        if (l == r) {
            segmentTree[idx] = newVal;
            return;
        }
        int mid = (l + r) / 2;
        if (pos <= mid) update(segmentTree, l, mid, pos, newVal, 2 * idx + 1);
        else update(segmentTree, mid + 1, r, pos, newVal, 2 * idx + 2);
        segmentTree[idx] = segmentTree[2 * idx + 1] + segmentTree[2 * idx + 2];
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int n = arr.length;
        int[] segmentTree = new int[4 * n]; // Safe size for segment tree

        // Build the segment tree
        build(arr, segmentTree, 0, n - 1, 0);

        // Query sum in range [1, 4]
        System.out.println("Sum in range [1, 4]: " + querySum(segmentTree, 0, n - 1, 1, 4, 0)); // Output: 24

        // Update index 2 to value 10
        update(segmentTree, 0, n - 1, 2, 10, 0);

        // Query sum in range [1, 4] after update
        System.out.println("Sum in range [1, 4] after update: " + querySum(segmentTree, 0, n - 1, 1, 4, 0)); // Output: 29
    }
}

/*
Explanation:
- build: Recursively builds the segment tree, each node stores the sum of its range.
- querySum: Returns the sum of elements in the range [ql, qr].
- update: Updates the value at index pos to newVal and updates the tree.
- All methods are static and operate on arrays.
*/
