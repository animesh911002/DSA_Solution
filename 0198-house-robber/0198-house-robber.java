class Solution {
    public int rob(int[] nums) {
        int memo[]=new int[nums.length+1];
        for(int i=0;i<=nums.length;i++) memo[i]=-1;
        return recFun(nums,0,memo);
    }
    public int recFun(int[] nums,int idx,int[] memo){
        if(idx==nums.length-1){
            return nums[idx];
        }
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        memo[idx]=Math.max(recFun(nums,idx+1,memo),recFun(nums,idx+2,memo)+nums[idx]);
        return memo[idx];
    }
}