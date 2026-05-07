package decisionFor;

public class decisionWhile {
	public static void main(String[] args) {
		//When i don't know when the loop will stop. i use this loop (WHILE)
		int i = 1;
		while (i <= 5) {
			System.out.println("Number: " + i);
			//Composite Decision
			if (i % 2 == 0) {
				System.out.println("Pair");
			}else {
				System.out.println("Odd");
				//Nested Decision
				if(i >= 3) {
					if(i == 5) {
						System.out.println("Maximum Number");
					}else {
						System.out.println("Number greater than or equal to 3");
					}}else {
						System.out.println("Minor than 5");
					}
					System.out.println("=======================");
					i++;

				}
			}
		}
		
		
		
		
		
		
		
	
		
		
		
	}

