package softserve.edu03;

import java.text.DecimalFormat;
import java.util.Scanner;
/*In your local project in Idea mark directory    src   like directory where is java code*/
public class phoneCall {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tell me how much first call costs per minute:");
		double c1 = scanner.nextDouble();
		System.out.println("Now tell me how long your phone call was in seconds:");
		double t1 = scanner.nextDouble()/60;
		System.out.println("Tell me how much second call costs per minute:");
		double c2 = scanner.nextDouble();
		System.out.println("Now tell me how long your phone call was in seconds:");
		double t2 = scanner.nextDouble()/60;
		System.out.println("Tell me how much third call costs per minute:");
		double c3 = scanner.nextDouble();
		System.out.println("Now tell me how long your phone call was in seconds:");
		double t3 = scanner.nextDouble()/60;
		scanner.close();
		
		double s1 = multiply(c1,t1);
		System.out.println(s1);
		double s2 = multiply(c2,t2);
		System.out.println(s1);
		double s3 = multiply(c3,t3);
		System.out.println(s3);
		
		double totalSum = s1+s2+s3;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String result = decimalFormat.format(totalSum);
		
		System.out.println("The sum of 3 calls is:" +totalSum);     //  не вийшло округлити до #,##
	}
	
	static double multiply(double c, double t) {
		return c*t;
	}

}
