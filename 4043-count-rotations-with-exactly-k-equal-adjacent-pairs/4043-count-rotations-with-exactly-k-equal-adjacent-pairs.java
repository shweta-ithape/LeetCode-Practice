class Solution {
    public int countRotations(String s, int k) {
        
        int n = s.length();
        int[] score = new int[n];

        for (int rotation = 0; rotation < n; rotation++) {

            int count = 0;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }

            score[rotation] = count;

            s = s.substring(1) + s.charAt(0);
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (score[i] == k) {
                answer++;
            }
        }

        return answer;
    }
}