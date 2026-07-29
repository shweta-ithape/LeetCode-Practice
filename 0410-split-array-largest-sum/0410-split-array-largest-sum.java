class Solution {
    public boolean isPossible(int[] nums, int k, int maxSplit){
        int split = 1;
        int subA = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxSplit){
                return false;
            }
            if(subA + nums[i] <= maxSplit){
                subA += nums[i];
            }else{
                split++;
                subA = nums[i];
            }
        }
        return split <= k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;

        int sum = nums[0]; 
        int maxValue = nums[0];

        for(int i = 1; i < n; i++){
            maxValue = Math.max(maxValue,nums[i]);
            sum += nums[i];
        }

        int st = maxValue;
        int end = sum;
        int result = -1;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(isPossible(nums,k,mid)){
                result = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return result;
    }
}