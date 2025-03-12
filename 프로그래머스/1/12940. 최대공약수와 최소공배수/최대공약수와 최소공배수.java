class Solution {
    public int[] solution(int n, int m) {
        
        if (n > m) {
            int tmp = m;
            m = n;
            n = tmp;
        }

        int product = n * m; 
        int a = n, b = m;

       
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        
        int gcd = b; // GCD (최대공약수)
        int lcm = product / gcd; // LCM (최소공배수)

        return new int[]{gcd, lcm}; // 배열 반환
    }
}
