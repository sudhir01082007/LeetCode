class Solution {
    public int divide(int dividend, int divisor) {
        int a=dividend/divisor;
        if(dividend==-2147483648 && divisor==-1){
            a=2147483647;
        }
        return a;
    }
}