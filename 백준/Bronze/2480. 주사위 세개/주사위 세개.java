import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
     
      if(a<=6 && b<=6 && c<=6 && a>0 && b>0 && c>0) {
      if(a==b && b==c) { // 전부 같을때
    	  System.out.print(10000 + 1000*a);
      }
      else if(a!=b || b!=c || a!=c) { // 한쌍만 다를때
    	  if(a!=b && a != c && b!=c) { // 전부 다를때
    		  if(a>b && a>c) {
    			  System.out.println(a*100);
    		  }
    		  else if(b>c && b>a) {
    			  System.out.println(b*100);
    		  }
    		  else if(c>a && c>b) {
    			  System.out.println(c*100);
    		  }  
    	  }				// 여기까지 전부 다를때
      
    	  if(a==b) {
    		  System.out.println(1000 + a*100);
    	  }
    	  else if(b==c) {
    		  System.out.println(1000 + b*100);
    	  }
    	  else if(c==a) {
    		  System.out.println(1000 + c*100);
    	  }// 두개만 같을 때
      }
      }
    }
}
