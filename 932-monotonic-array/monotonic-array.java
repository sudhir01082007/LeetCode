class Solution {
    public boolean isMonotonic(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                a++;
            }
            else{
                if(nums[i]<nums[i+1]){
                    b++;
                }
            }
        }
        if(a==0 || b==0){
            return true;
        }
        return false;    
    }
}