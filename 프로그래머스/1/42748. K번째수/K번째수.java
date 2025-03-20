import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        // commands[i][j] j는 무조건 2까지 있다.
        // i번째 >> array를 commands i,0 부터 commands i,1 까지 >> 정렬 >> i,2번째 위치
        for(int i = 0; i < commands.length; i++){
            int [] arr = new int[commands[i][1]-commands[i][0] +1];
            for(int j = 0; j < commands[i][1]-commands[i][0] +1; j++){
                arr[j] = array[commands[i][0] - 1 + j];
            }
            Arrays.sort(arr);
            
            answer[i] = arr[commands[i][2] - 1];
        } 
        
        return answer;
    }
}