class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        int rsa[] = new int[n];

        int rs = 0;
        for(int i = 0; i < n;i++){
            rs = rs + nums[i];
            rsa[i] = rs;
        }
        return rsa;
    }
}