class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,c=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                c+=accounts[i][j];
            }
            if(c>sum){
                sum=c;
            }
            c=0;
        }
        return sum;
    }
}