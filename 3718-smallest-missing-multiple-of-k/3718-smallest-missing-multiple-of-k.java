class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        int posMul = 0;

        for(int i = 1; ; i++){
            posMul = k * i;

            
            if(!set.contains(posMul)){
                return posMul;
            }
            
        }
    }
}