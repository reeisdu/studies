package aula17_03;

public class robo {
	
	//attributes
	String n;
	String c;
	int e;
	
	public robo(String n, String c, int e) {
		
		//builder
		this.n = n;
		this.c = c;
		this.e = e;
	}
	
	void showInfo() {
		//PRINT
		System.out.println("Robot's name: " + n);
		System.out.println("Robot's color: " + c);
		System.out.println("Robot's energy: " + e);
		System.out.println("==========================");
	}
}
