class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] frequency = new int[128];

        int left = 0;
        int maximumLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            frequency[currentCharacter]++;
            while (frequency[currentCharacter] > 1) {
                char removedCharacter = s.charAt(left);

                frequency[removedCharacter]--;
                left++;
            }
            int currentLength = right - left + 1;
            maximumLength = Math.max(maximumLength, currentLength);
        }

        return maximumLength;
    }
}