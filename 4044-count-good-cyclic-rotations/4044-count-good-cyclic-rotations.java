class Solution {
    public int countGoodRotations(int[] nums) {
        long sum1=0;
        long sum2=0;
        int cnt=0;
        for(int i=0;i<nums.length/2;i++)
        {
            sum1=sum1+nums[i];
            sum2=sum2+nums[nums.length/2+i];
        }
        if(sum1>sum2)
        {
            cnt++;
        }
        int r=nums.length/2;
        int l=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum2=sum2+nums[l];
            sum1=sum1-nums[l];
            sum1=sum1+nums[r];
            sum2=sum2-nums[r];
            l=(l+1)%nums.length;
            r=(r+1)%nums.length;
            if(sum1>sum2)
            {
                cnt++;
            }
        }
        return cnt;
    }
}