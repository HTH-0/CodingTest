class Solution {
    public String solution(String s, int n) {
        // 아스키코드값, z 보다 커진다면 a로 돌아가게, 공백은 공백
        String answer = "";
        for(int i = 0; i<s.length(); i++){ 
            
            int sAscii = (int)s.charAt(i);
            
            if(sAscii >= 97 && sAscii <= 122){
               sAscii = (sAscii - 97 + n) % 26 + 97;
                
            }else if(sAscii >= 65 && sAscii <= 90){
               sAscii = (sAscii - 65 + n) % 26 + 65;
            }
        answer += (char)sAscii;
        }
        
        
        return answer;
    }
}