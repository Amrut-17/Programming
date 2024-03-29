class Solution {
    public boolean canJump(int[] nums) {
        // if(nums[0] == 0) return false;     
        int maxDistance = 0;
        for(int i=0; i<nums.length; i++){
            if(maxDistance < i){
                return false;
            }
            maxDistance  = Math.max(maxDistance, i+nums[i]);
        }
        return true;
    }
}

//  GREEDY ALGO 
