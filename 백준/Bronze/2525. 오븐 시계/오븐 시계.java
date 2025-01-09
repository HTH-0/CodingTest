import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        // 조건 1.m + t 가 60이 넘어갈 경우 h에 1더함
        // 조건 1-2. m + t 가 120 ++ 가 되는 경우 h에 2이상 더함
        // >> m+t 값을 60으로 나눠서 몫을 구하고 h에 더함
        // 조건 2.h가 23 이상이 되는 경우 h가 0이됨
        int h2 = h + (m+t)/60 ; // 합이 넘어갈때
        if(m+t >= 60) {
        	if(h2<=23) { // h2가 23이 넘어갈때, 아닐때 구분
        		System.out.print(h2+" ");
        		System.out.print((m+t)%60);
        	}
        	else if (h2>23) {
        		System.out.print(h2-24+" ");
        		System.out.print((m+t)%60);
        	}
        }
        else if(m+t < 60) {
        	System.out.print(h+" ");
    		System.out.print(m+t);
        }
    }
}