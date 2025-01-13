import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader와 BufferedWriter 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력받기
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= t; i++) {
            // 한 줄 입력받아 공백을 기준으로 분리
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            
            // 출력 버퍼에 결과 추가
            bw.write((a + b) + "\n");
        }
        
        // 출력 버퍼 플러시 및 닫기
        bw.flush();
        bw.close();
        br.close();
    }
}