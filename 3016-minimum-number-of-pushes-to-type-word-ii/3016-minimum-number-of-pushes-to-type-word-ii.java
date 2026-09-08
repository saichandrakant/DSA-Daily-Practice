import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // 1. Count each letter
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // 2. Sort frequencies
        Arrays.sort(freq);

        int ans = 0;

        // 3. Start with highest frequency
        for (int i = 25; i >= 0; i--) {

            // Every 8 letters, pushes increase
            int pushes = (25 - i) / 8 + 1;

            // frequency × pushes
            ans += freq[i] * pushes;
        }

        return ans;
    }
}