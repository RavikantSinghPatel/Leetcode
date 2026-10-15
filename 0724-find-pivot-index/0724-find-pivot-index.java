class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        int rightSum;
        for(int i=0; i<nums.length;i++){
            totalSum +=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rightSum=totalSum-leftSum-nums[j];
            if(leftSum==rightSum){
                return j;
            }
            else{
                leftSum +=nums[j];
            }
        }
        return -1;
        
    }
}