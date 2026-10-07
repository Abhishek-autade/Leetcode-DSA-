class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            if (!Character.isLetter(arr[i])) {
                // i is not a letter move 
                i++;
            } else if (!Character.isLetter(arr[j])) {
                // j is not a letter
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}