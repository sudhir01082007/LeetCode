class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> ss=new HashSet<>();
        int a=s.length();
        for(int i=0;i<a;i++){
            char q=s.charAt(i);
            if(ss.contains(q)){
                return q;
            }
            else{
                ss.add(q);
            }
        }
        return 0;
    }
}