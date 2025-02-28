class Solution {
    public int[] solution(long n) {
        
        // 자리수별로 배치되는 배열을 만든다
        // 배열의 자리를 뒤집는다.
        String str = Long.toString(n);
        // 자연수를 문자열로
        
        int[] answer = new int[str.length()];
        // 배열 선언
        
        for(int i = 0; i<str.length(); i++){
            answer[i] = str.charAt(str.length()-i-1)-'0';
        }
        // 배열에 값 입력
        
        
        
        
        return answer;
    }
}