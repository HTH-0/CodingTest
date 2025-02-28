class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        // 불리언 적용
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i] == false){
                absolutes[i] = -absolutes[i];
            }
        }
        for(int i = 0; i<absolutes.length; i++){
            answer += absolutes[i];
        }
        
        return answer;
    }
}