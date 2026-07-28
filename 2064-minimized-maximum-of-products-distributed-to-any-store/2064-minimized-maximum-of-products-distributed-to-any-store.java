class Solution {
    public boolean isValid(int[] quantities, int n, int mid){
        int storesNeeded = 0;
    
        for(int quantity : quantities){
            storesNeeded += (quantity + mid - 1) / mid;
        }

        if(storesNeeded > n){
            return false;
        }
        return true;
    }


    public int minimizedMaximum(int n, int[] quantities) {

        int max = 0;
        for(int quantity : quantities){
            max =Math.max(max,quantity); 
        }

        int st = 1;
        int end = max;
        int ans = max;

        while(st <= end){
            int mid = st + (end - st)/2;

            if(isValid(quantities, n , mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }
}