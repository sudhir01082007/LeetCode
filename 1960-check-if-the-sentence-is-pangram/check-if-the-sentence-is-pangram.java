class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> a=new HashSet<>();
        char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<sentence.length();i++){
            char w=sentence.charAt(i);
            if(Character.isLowerCase(w)){
                a.add(w);
            }
            else{
                return false;
            }
        }
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(!a.contains(c)){
                return false;
            }
        }
        return true;
    }
}