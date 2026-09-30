class Solution {
   public int peakIndexInMountainArray(int[] arr) {
       int n = arr.length;
       int maxx = arr[0];
       int index = 0;
      
       for (int i = 1; i < n; i++) {
           if (arr[i] > maxx) {
               maxx = arr[i];
               index = i;
           }
       }
       return index;
   }
}

