class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i = 1; i<=n; i++){
            if(i*i == n && n%i == 0){
                answer = (i + 1) * (i + 1);
                break;
            }
            else{
                answer = -1;
            }
        }
        return answer;
    }
}