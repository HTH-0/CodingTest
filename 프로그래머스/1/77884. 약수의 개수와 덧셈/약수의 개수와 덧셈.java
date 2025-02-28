class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left 부터 right 까지 쭉 반복한다.
        for(int i = 0; i <= right-left; i++){
            int divisornum = 0;// 약수 개수
            int divisorsum = 0;// 약수 합
            
            // left를 1부터 left까지 반복해서 약수개수 확인
            for(int j = 1; j <= left+i ; j++){
                if((left+i) % j == 0){
                    divisornum ++;
                }
            }
            if(divisornum % 2 == 0){
                answer += left+i;
            }
            else if(divisornum % 2 == 1){
                answer -= left+i;
            }
        }
        
        
        return answer;
    }
}