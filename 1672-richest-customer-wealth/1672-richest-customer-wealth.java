class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int maxW = 0;

        for(int i = 0;i < n; i++){
            int wealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                wealth = wealth + accounts[i][j];
            }
            if(wealth > maxW){
                maxW = wealth;
            }
        }
        return maxW;
    }
}