import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int check = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                check++;
            }
        }

        int[] answer = new int[arr.length - check];
        int index = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }
}