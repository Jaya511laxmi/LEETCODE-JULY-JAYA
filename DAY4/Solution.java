class Solution {
    public char kthCharacter(long k, int[] operations) {
        if (k == 1) return 'a';
        
        int cnt = 0;
        int n = operations.length;
        long[] pow2 = new long[n + 1];
        pow2[0] = 1;
        
    
        for (int i = 1; i <= n; i++) {
            long doubled = pow2[i - 1] << 1;
            pow2[i] = doubled > 0 ? doubled : Long.MAX_VALUE;
        }
        
        while (k > 1) {
            int i = 1;
            while (i <= n && pow2[i] < k) i++;
            
            k -= pow2[i - 1]; 
            if (operations[i - 1] == 1) cnt++; 
        }
        
        return (char)('a' + cnt % 26); 
    }
}
