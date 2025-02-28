class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
    
        // 가격 : price * sum count( 1부터 count 까지의 합)
        // 내 돈 : money
        long sum = 0;
        for(int i = 1; i<=count; i++){
            sum += i;
        }
        if( sum * price > money){
            answer = sum * (long)price - money;
        }
        else{
            answer = 0;
        }
        
        return answer;
    }
}