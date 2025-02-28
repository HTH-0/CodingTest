class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int sum0 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == 0){
                sum0 ++;
            }
            if(numbers[i] == 1){
                sum1 ++;
            }
            if(numbers[i] == 2){
                sum2 ++;
            }
            if(numbers[i] == 3){
                sum3 ++;
            }
            if(numbers[i] == 4){
                sum4 ++;
            }
            if(numbers[i] == 5){
                sum5 ++;
            }
            if(numbers[i] == 6){
                sum6 ++;
            }
            if(numbers[i] == 7){
                sum7 ++;
            }
            if(numbers[i] == 8){
                sum8 ++;
            }
            if(numbers[i] == 9){
                sum9 ++;
            }    
        }
        if (sum0 == 0){
            answer += 0;
        }
        if (sum1 == 0){
            answer += 1;
        }
        if (sum2 == 0){
            answer += 2;
        }
        if (sum3 == 0){
            answer += 3;
        }
        if (sum4 == 0){
            answer += 4;
        }
        if (sum5 == 0){
            answer += 5;
        }
        if (sum6 == 0){
            answer += 6;
        }
        if (sum7 == 0){
            answer += 7;
        }
        if (sum8 == 0){
            answer += 8;
        }
        if (sum9 == 0){
            answer += 9;
        }
        
        
        
        return answer;
    }
}