package quiz2;

import java.util.Scanner;
public class quiz2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the tuition cost: ");
		double tuition = input.nextDouble();
		
		double percentage;
		double sum = 0;
		
		for(int year = 0; year < 3; year++){
			System.out.print("Enter the percentage increase: ");
			percentage = input.nextDouble();
			sum += tuition;
			tuition += tuition*percentage;
		}
		System.out.printf("The cost for attending school for four years is " + "%.2f", sum);
	}
	

}
