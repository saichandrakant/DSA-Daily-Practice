class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int cnt=0;
        boolean zero=false;
        for(int a:nums)
        {
            xor=xor^a;
            if(a==0)
            {
                cnt++;
               
            }
        }
        if(cnt==nums.length)
        {
            return 0;
        }
        if(xor!=0)
        {
            return nums.length;
        }
        return nums.length-1;
    }
}