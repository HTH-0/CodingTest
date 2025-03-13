class Solution {
    public String solution(String s) {
        String answer = "";
        int wordIndex = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i)== ' '){
                answer += s.charAt(i);
                wordIndex = 0;
            }else{
                if(wordIndex % 2 == 0){
                    answer += s.toUpperCase().charAt(i);
                }else{
                    answer += s.toLowerCase().charAt(i);
                }
                wordIndex ++;
            }
            
        }
        
        return answer;
    }
}