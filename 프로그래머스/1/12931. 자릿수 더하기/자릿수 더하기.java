import java.util.*;

public class Solution {
    public int solution(int n) {
        Scanner sc = new Scanner(System.in);
    
       
        int answer = 0;
        
        while(n>0){
            answer += n % 10;
            n /= 10;
         
        }
        
        
        
        return answer;
    }
}