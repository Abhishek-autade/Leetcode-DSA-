class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlength = Integer.MAX_VALUE;
        int left = 0;
        int currsum =0;
        for(int right = 0; right<nums.length; right++){
            currsum +=nums[right];
            while(currsum >= target){
                if(right-left+1 < minlength){
                    minlength = right-left+1;
                }
                currsum -= nums[left];
                left++;
            }
        }
        return minlength != Integer.MAX_VALUE?minlength : 0;
    }
}