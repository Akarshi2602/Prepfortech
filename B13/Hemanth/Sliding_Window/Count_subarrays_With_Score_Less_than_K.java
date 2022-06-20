// https://leetcode.com/problems/count-subarrays-with-score-less-than-k/

class Solution {
    public long countSubarrays(int[] nums, long k) {
        long sum=0;
        long res=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum*(i-j+1)>=k){
                sum-=nums[j++];
            }
            res+=(i-j+1);
        }
        return res;
    }
}
