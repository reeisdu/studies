package poo;

public class FabricaDeRobos {
	
	public static void main(String[] args) {
		
		
		//Creating the First Object: 
		
		poo r1 = new poo();
		r1.n = "Morgan";
		r1.c = "Blue";
		r1.e = 100;
		
		//Creating the Second Object: 
		
		poo r2 = new poo();
		r2.n = "Arthur";
		r2.c = "Red";
		r2.e = 300;
		
		//Showing the informations: 
		
		r1.showData();
		r2.showData();
		
		
		
		//The class is the body. She is like a "House's plant". By the way the Objects are like "the cups or the sofa".
		//The builders are like the pieces of code, called by the dev.
	
	}
}
