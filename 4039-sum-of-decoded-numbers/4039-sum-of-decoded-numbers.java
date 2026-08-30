import java.math.BigInteger;

class Solution {
    public int sumDecoded(long[] nums) {
        long MOD = 1000000007;
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int width = (int)(nums[i] % 10);
            long d = nums[i] / 10;

            long temp = d;
            int digits = 0;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            long divisor = 1;

            for (int j = 0; j < digits - width; j++) {
                divisor *= 10;
            }

            long x = d / divisor;
            long y = d % divisor;

            BigInteger value = BigInteger.valueOf(x)
                    .modPow(BigInteger.valueOf(y), BigInteger.valueOf(MOD));

            ans = (ans + value.longValue()) % MOD;
        }

        return (int) ans;
    }
}