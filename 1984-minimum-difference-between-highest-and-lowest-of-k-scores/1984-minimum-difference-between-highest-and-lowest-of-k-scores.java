class Solution { 
    public int minimumDifference(int[] nums, int k) { 
        Arrays.sort(nums); 
        int l=0; 
        int r=0; 
        int min=Integer.MAX_VALUE; 
       
         
        while(r<nums.length) 
        { 
            if(r-l+1==k) 
            { 
                min=Math.min(nums[r]-nums[l],min); 
                l++; 
            } 
            r++; 
        } 
        return min; 
    } 
} 