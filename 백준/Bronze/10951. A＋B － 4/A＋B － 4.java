//무한루프
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextInt()) {			//무한루프
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	System.out.println(a+b);

        }
    }
}