class Solution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        //freq counttt
        for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         // array index find
        int index = ch - 'a';
             // count++
            frequency[index]++;
        }

        // Find the firstcharrr
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (frequency[index] == 1) {
                return i;
            }
        }

        return -1;
    }
}