class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int n=x;
        while(n>0)
        {
            rem=rem*10+n%10;
            n=n/10;
        }
        return rem==x;
    }
}