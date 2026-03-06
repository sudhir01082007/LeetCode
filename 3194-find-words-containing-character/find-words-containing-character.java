class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> a=new ArrayList<>();
       for(int i=0;i<words.length;i++){
        String s=words[i];
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==x){
                a.add(i);
                break;
            }
        }
       }
       return a; 
    }
}