package aula14_04;

public class Main {

	public static void main (String[] args) {
		//cachorro
		cachorro cachorro = new cachorro();
		cachorro.nome = "2Pac ";
		cachorro.comer();
		cachorro.latir();
		System.out.println();
		
		//gato
		gato gato = new gato();
		gato.nome = "Emy ";
		gato.miar();
		gato.terFilhos();
		gato.rasgarCortinas();
		gato.comer();
		gato.beber();
		System.out.println();
		
		//papagaio
		papagaio papagaio = new papagaio();
		papagaio.nome = "Chuck Norris ";
		papagaio.imitar();
		papagaio.voar();
		papagaio.beber();
		papagaio.cantar();
		papagaio.comer();
		System.out.println();
		
		//tubarão
		tubarao tubarao = new tubarao();
		tubarao.nome = "Bruce ";
		tubarao.procurar();
		tubarao.atacar();
		tubarao.cacar();
		tubarao.comer();
		System.out.println();
		
		
		
		

	}
}
