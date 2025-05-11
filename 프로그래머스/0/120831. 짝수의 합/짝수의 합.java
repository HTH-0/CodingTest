class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) { // 짝수만 증가
            answer += i;
        }
        return answer;
    }
}