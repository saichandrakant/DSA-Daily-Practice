class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int x : nums1) {
            if ((x & 1) == 1) {
                minOdd = Math.min(minOdd, x);
            } else {
                minEven = Math.min(minEven, x);
            }
        }

        // All numbers are even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // We can make every number odd
        if (minOdd < minEven) {
            return true;
        }

        return false;
    }
}