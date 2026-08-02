class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String>current = new ArrayList<>();

        int n = s.length();

        boolean[][] dp = new boolean[n][n];

        for(int i = n -1; i >= 0; i--){
            for(int j =i; j < n; j++){
                if(s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                }
            }
        }

        backtrack(s,0,dp,current,result);

        return result;
    }

    private void backtrack(String s, int start, boolean[][] dp, List<String>current, List<List<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int end = start; end < s.length(); end++){
            if(dp[start][end]){
                current.add(s.substring(start,end + 1));
                backtrack(s,end+1, dp,current,result);
                current.remove(current.size()-1);
            }
        }
    }
}