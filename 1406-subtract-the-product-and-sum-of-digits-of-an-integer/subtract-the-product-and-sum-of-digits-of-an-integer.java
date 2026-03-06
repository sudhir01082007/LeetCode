class Solution {
    public int subtractProductAndSum(int n) {
        int sum=1,c=0;
        while(n>0){
            int a=n%10;
            sum*=a;
            c+=a;
            n/=10;
        }
        return sum-c;
    }
}