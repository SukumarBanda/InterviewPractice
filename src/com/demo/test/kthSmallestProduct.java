static int kthSmallestProduct(int[] A, int[] B,int K)
{
    Vector<Integer> posA = new Vector<>();
    Vector<Integer> negA = new Vector<>();
    Vector<Integer> posB = new Vector<>();
    Vector<Integer> negB = new Vector<>();
    // Loop to iterate array A[]
    for (int  it : A) {
        if (it >= 0)
            posA.add(it);
        else
            negA.add(it);
    }

    // Loop to iterate array B[]
    for (int it : B)
        if (it >= 0)
            posB.add(it);
        else
            negB.add(it);

    // Stores the lower and upper bounds of the binary search
    int l = Integer.MIN_VALUE, r = Integer.MAX_VALUE;

    // Stores the final answer
    int ans=0;

    // Find the kth smallest integer using binary search
    while (l <= r) {

        // Stores the mid
        int mid = (l + r) / 2;

        // If the number of elements greater than mid in product array are more than K
        if (check(mid, posA, posB, negA, negB, K)) {
            ans = mid;
            r = mid - 1;
        }
        else {
            l = mid + 1;
        }
    }

    // Return answer
    return ans;
}


public static void main(String[] args)
{
   int[] A = { -4, -2, 0, 3 };
    int[] B = { 1, 10 };
    int K = 7;

    System.out.print(kthSmallestProduct(A, B, K));

}
}
