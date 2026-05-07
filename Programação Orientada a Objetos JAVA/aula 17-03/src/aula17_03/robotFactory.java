package aula17_03;
import java.util.Scanner;
public class robotFactory {
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Register of Robots!");
		System.out.println("Write thew Robot's Name: ");
		String n = x.nextLine();
		System.out.println("Write the Robot's Color: ");
		String c = x.nextLine();
		System.out.println("Write the number of the Robot's Energy: ");
		int e = x.nextInt();
		
		
		//Creating the object using the Builder
		robo r = new robo(n,c,e);
		r.showInfo();
		x.close();
		
	}
}
