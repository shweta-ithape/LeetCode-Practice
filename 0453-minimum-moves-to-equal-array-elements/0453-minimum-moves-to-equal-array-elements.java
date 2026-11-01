class Solution {
    public int minMoves(int[] nums) {
        int sm = Integer.MAX_VALUE;

        for(int num:nums){
            sm = Math.min(num,sm);
        }

        int minm = 0;

        for(int num:nums){
            minm += num - sm;
        }

        return minm;
    }
}