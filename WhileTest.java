import java.util.Scanner;
public class WhileTest {

	public static void main(String[] args) {
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num=obj.nextInt();
		while(num>=0){
			sum+=num;
			System.out.print("Enter a number = ");
			num=obj.nextInt();
		}
		System.out.println(" SUM =  "+sum);
	}

}
