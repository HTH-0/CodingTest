class Solution {
    public int solution(int n) {
    
        // n을 3진법으로
        String m = Integer.toString(n,3);
        String str = "";
        for(int i = m.length()-1; i >= 0; i--){
            str += m.charAt(i);
        }
        int answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}