class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        int res=0,c=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(a>0){
                int w=a%10;
                sum+=w;
                a/=10;
            }
            if(i==sum){
                res=sum;
                c++;
                break;            
            }
            sum=0;
        }
        if(c>0)
        {
            return res;
        }
        return -1;
    }
}