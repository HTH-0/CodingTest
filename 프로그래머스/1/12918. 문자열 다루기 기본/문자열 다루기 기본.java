class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 6 && s.length() != 4){
            answer = false;
        }
        for(int i = 0; i < s.length(); i++){    // 모든 요소를 체크했을 때
            if(s.charAt(i) < '0' || s.charAt(i) > '9'){             
            //아스키코드 값으로 생각해보기 
                answer = false;
            }        
        }
        
        return answer;
    }
}