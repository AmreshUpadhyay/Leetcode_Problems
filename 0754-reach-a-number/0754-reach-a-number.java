class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        long lo = 1, hi = 100000;
        long n = 0;
        while (lo <= hi) {
            long mid = lo+(hi - lo)/2;
            long sum = mid*(mid + 1)/2;
            if (sum >= target) {
                n = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        long sum = n * (n + 1) / 2;
        while (((sum - target) & 1) != 0) {
            n++;
            sum += n;
        }
        return (int)n;
    }
}