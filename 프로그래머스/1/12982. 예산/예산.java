class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        
        // 배열을 오름차순 정렬 한 뒤 음수가 나올때까지 빼기

        for(int i = 0; i< d.length - 1; i++){
            for(int j = 0; j< d.length - i - 1; j++){
                if(d[j] > d[j+1]){
                    int tmp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i<d.length ; i++){
            if ( budget >= d[i]){
                budget -= d[i];
                answer ++;
            }
            else{
                break;
            }
        }
        
        
        
        return answer;
    }
}