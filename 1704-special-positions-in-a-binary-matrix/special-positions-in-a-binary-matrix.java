class Solution {
    public int numSpecial(int[][] mat) {
        int c=0,n=0;
        int len =mat.length;
        int len1=mat[0].length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
                if(mat[i][j]==1){
                    for(int k=0;k<len1;k++){
                        if(mat[i][k]!=0 && (j!=k)){
                            n++;
                            break;
                        }
                    }
                    for(int w=0;w<len;w++){
                        if(mat[w][j]!=0 && (i!=w)){
                            n++;
                            break;
                        }
                    }
                    if(n==0){
                        c++;
                    }
                    n=0;
                }
            }
        }
        return c;
    }
}