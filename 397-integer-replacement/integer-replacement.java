class Solution {
    public int integerReplacement(int n) {
        long nn=n;
        int c=0;
        while(nn>1){
            if(nn%2==0){
                nn/=2;
            }
            else{
                if(nn==3 || nn%4==1){
                    nn-=1;
                }
                else{
                    nn+=1;
                }
            }
            c++;
        }
        return c;
    }
}