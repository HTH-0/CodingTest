class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        
        // 1,2,3 1,2,4 ... 1,2,마지막
        // 1,3,4 1,3,5 ... 1,3,마지막
        // 1,마지막-1,마지막
        // 3중 for문??
        
        for(int i = 0; i < number.length - 2; i++){
            for( int j = i+1; j < number.length - 1; j++){
                for(int k = j+1 ; k < number.length; k++){
                    if(number[k] + number[j] + number[i] == 0){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}