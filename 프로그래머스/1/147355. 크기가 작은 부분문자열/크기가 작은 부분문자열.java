class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length();
        int pLength = p.length();
        long pValue = Long.parseLong(p); 

        for (int i = 0; i <= tLength - pLength; i++) {
            String sub = t.substring(i, i + pLength);
            long subValue = Long.parseLong(sub);
            if (subValue <= pValue) { 
                answer++;
            }
        }

        return answer;
    }
}