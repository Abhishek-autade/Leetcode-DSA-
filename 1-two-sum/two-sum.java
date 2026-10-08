class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        // Store
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        java.util.Arrays.sort(arr, (a, b) -> a[0] - b[0]);
       int l = 0, r = n - 1;
        while (l < r) {
            int sum = arr[l][0] + arr[r][0];
            if (sum == target) 
                return new int[]{arr[l][1], arr[r][1]};
            if (sum < target) 
                l++;
            else 
                r--;
        }
        return new int[]{-1, -1};
    }
}