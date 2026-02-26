class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int a=arr[0];
        int b=0;
        for(int i=1;i<arr.length;i++){
            if(a<arr[i]){
                a=arr[i];
                b=i;
            }
        }
        return b;
    }
}