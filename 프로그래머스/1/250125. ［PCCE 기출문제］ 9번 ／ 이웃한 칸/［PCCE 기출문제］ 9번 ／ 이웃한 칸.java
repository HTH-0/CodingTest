class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String color = board[h][w];
        int maxW = board[0].length;
        int maxH = board.length;
        if(h+1 < maxH && board[h+1][w].equals(color)){
            answer ++;
        }
        if(w+1 < maxW && board[h][w+1].equals(color)){
            answer ++;
        }
        if(w > 0 && board[h][w-1].equals(color)){
            answer ++;
        }
        if(h > 0 &&board[h-1][w].equals(color)){
            answer ++;   
        }
       
        
        
        return answer;
    }
}