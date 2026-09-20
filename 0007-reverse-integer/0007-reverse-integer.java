class Solution {
    public int reverse(int x) {
        int cnt=0;
        boolean yes=false;
        int n=x;
        long rem=0;
        if(x<0)
        {
            yes=true;
            n=-1*x;
        }
        while(n>0)
        {
            
            rem=rem*10+n%10;
            n=n/10;
            cnt++;
            if(cnt>10)
            {
                return 0;
            }
        }
       
        if(yes)
        {
            rem= -rem;
        }
        if(rem>Integer.MAX_VALUE || rem<Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)rem;
    }
}