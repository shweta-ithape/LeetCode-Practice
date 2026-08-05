class Solution {
    public boolean makesquare(int[] matchsticks) {
         int sum = 0;

        for (int stick : matchsticks) {
            sum += stick;
        }

        if (sum % 4 != 0) {
            return false;
        }

        int target = sum / 4;

        Arrays.sort(matchsticks);
        reverse(matchsticks);

        int[] sides = new int[4];

        return dfs(matchsticks, 0, sides, target);
    }

    private boolean dfs(int[] matchsticks, int index, int[] sides, int target) {

        if (index == matchsticks.length) {
            return true;
        }

        int stick = matchsticks[index];

        for (int i = 0; i < 4; i++) {

            if (sides[i] + stick > target) {
                continue;
            }

            sides[i] += stick;

            if (dfs(matchsticks, index + 1, sides, target)) {
                return true;
            }

            sides[i] -= stick;

            if (sides[i] == 0) {
                break;
            }
        }

        return false;
    }

    private void reverse(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}