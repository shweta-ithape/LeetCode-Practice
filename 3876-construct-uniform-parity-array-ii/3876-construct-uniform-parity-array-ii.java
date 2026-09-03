class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int smallestOdd = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 != 0){
                smallestOdd = Math.min(smallestOdd,nums1[i]);
            }
        }

        if(smallestOdd == Integer.MAX_VALUE){
            return true;
        }

        for(int i = 0; i < n; i++){
            if(nums1[i] % 2 == 0 && nums1[i] <= smallestOdd){
                return false;
            }
        }
        return true;
    }
}