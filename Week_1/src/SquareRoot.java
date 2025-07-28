import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
      
       for(int i=1;i<=num;i++) {
    	  System.out.println("Sqaure root of "+ i +" " +Math.sqrt(i));
       }
      
	}
}