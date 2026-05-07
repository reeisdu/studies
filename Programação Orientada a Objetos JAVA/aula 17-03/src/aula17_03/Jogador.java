package aula17_03;

public class Jogador {
	//private attributes
	
	private String n;
	private int a;
	private int nShirt;
	
	public Jogador(String n, int a, int nShirt) {
		this.n = n;
		this.a = a;
		this.nShirt = nShirt;
	}
	//get Name
	public String getname(String n) {
		return n;
	}
	//set Name
	public void setname(String n) {
		this.n = n;
	}
	
	//get Age
	public int getAge(int a) {
		return a;
	}
	//set Age
	public void setAge (int a) {
		this.a = a;
	}
	
	//get nShirt
	public int getnShirt(int nShirt) {
		this.nShirt = nShirt;
	}
	//set nShirt
	public void setnShirt (int nShirt) {
		this.nShirt = nShirt;
	}
	
	
	public void showInfo() {
		//PRINT
		System.out.println("Player's Data!");
		System.out.println("Player's Name: " + n);
		System.out.println("Player's Age: " + a);
		System.out.println("Player's nShirt: " + nShirt);
		System.out.println("==========================");
	}
}

