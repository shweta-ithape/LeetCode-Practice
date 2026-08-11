class Solution {
    public int numberOfPermutations(int n, int[][] requirements) {
        int MOD = 1000000007;

        int maxInv = 0;

        for(int[] r: requirements){
            maxInv = Math.max(maxInv, r[1]);
        }

        int[] req = new int[n];

        for(int i = 0; i < n; i++){
            req[i] = -1;
        }

        for(int[] r: requirements){
            req[r[0]] = r[1];
        }

        int[] dp = new int[maxInv + 1];
        dp[0] = 1;

        for(int i =1; i < n; i++){
            int[] prefix = new int[maxInv+1];
            prefix[0] = dp[0];

            for(int j =1; j <= maxInv; j++){
                prefix[j] = (prefix[j-1] + dp[j]) % MOD;
            }

            int[] next = new int[maxInv+1];

            for(int j = 0; j <= maxInv; j++){
                int left = Math.max(0, j-i);
                next[j] = prefix[j];

                if(left > 0){
                    next[j] -= prefix[left-1];
                }

                next[j] = (next[j]+MOD) % MOD;
            }

            dp = next;

            if(req[i] != -1){
                int required = req[i];

                for(int j = 0; j <= maxInv; j++){
                    if(j != required){
                        dp[j] = 0;
                    }
                }
            }
        }
        return dp[req[n-1]];
    }
}