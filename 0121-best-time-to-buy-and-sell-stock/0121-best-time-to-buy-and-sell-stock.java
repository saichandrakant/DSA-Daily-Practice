class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]-min);
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return max;
    }
}