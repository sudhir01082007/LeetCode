class Solution {
    public int smallestEqual(int[] nums) {
        int c=0,w=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==i%10){
                w++;
                c=i;
                break;
            }
        }
        if(w>0){
            return c;
        }
        return -1;
    }
}