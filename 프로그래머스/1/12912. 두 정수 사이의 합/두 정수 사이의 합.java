class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = a;
        if(a>b){
            a = b;
            b = tmp;
        }
        else if ( a == b){
            answer = a;
        }
        for(int i = 0; i<=b-a; i++){
            answer += a+i;
        }
        return answer;
    }
}