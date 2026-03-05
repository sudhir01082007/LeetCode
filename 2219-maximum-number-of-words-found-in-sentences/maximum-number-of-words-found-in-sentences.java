class Solution {
    public int mostWordsFound(String[] sentences) {
        int c=0;
        for(int i=0;i<sentences.length;i++){
           String a=sentences[i];
           int sum=1;
           for(int j=0;j<a.length();j++){
            char cc=a.charAt(j);
            if(cc==' '){
                sum++;
            }
           }
           if(sum>c){
            c=sum;
           }
           sum=1;    
        }
        return c;
    }
}