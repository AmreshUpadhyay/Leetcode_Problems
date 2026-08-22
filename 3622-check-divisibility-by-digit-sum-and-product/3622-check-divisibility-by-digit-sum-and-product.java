class Solution {
    public boolean checkDivisibility(int n) {
        int i = 0;
        int sum = 0;
        int prod = 1;
        int d =0;
        int j = n;
        while(j>0){
            d = j%10;
            sum += d;
            prod *= d;
            j = j / 10;
        }
        return n % (sum + prod)==0;
    }
}