import java.util.Scanner;
public class DoWhileTest {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		Scanner obj=new Scanner(System.in);
	
		do {
			sum+=num;	
			System.out.print("Enter a number  = ");
			num=obj.nextInt();
			 
		}
		while(num>=0) ;
			System.out.print("SUM  =  "+sum);		
	}

}
