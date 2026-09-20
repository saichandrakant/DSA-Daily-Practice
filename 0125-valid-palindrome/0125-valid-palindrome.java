class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String m="";
        for(int i=s.length()-1;i>=0;i--)
        {
            m=m+s.charAt(i);
        }
        return s.equals(m);
    }
}