class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        
        for(int i = 0; i<arr.length; i++){
        sum += (double)arr[i];
        }
        double answer = sum / arr.length;
        
        return answer;
    }
}