class Solution {
    public int minimumPushes(String word) {
        if(word.length()>24)
        {
            return (word.length()-24)*4+(3*8)+(2*8)+(8);
        }
        if(word.length()>16)
        {
            return (word.length()-16)*3+(2*8)+(8);
        }
        if(word.length()>8)
        {
            return (word.length()-8)*2+(8);
        }
        return word.length();
    }
}