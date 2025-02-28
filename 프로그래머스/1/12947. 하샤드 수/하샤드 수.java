class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        
        // 자릿수 합 구하기
        int sum = 0;
        int y = x;
        while(y>0){
            sum += y % 10;
            y /= 10;
        }
        
        if(x % sum == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}