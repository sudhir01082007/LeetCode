class Solution {
    public String firstPalindrome(String[] words) {
        String a="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.length()>1){
            for(int j=0;j<s.length()/2;j++){
                int w=s.length()-1-j;
                if(s.charAt(j)==s.charAt(w)){
                    if(s.length()/2-1 == j){
                        return s;
                    }
                }
                else{
                    break;
                }
            }
            }
            else{
                return s;
            }
        }
        return "";
    }
}