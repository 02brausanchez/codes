package apanloo;

public class Main {
	public static void main(String[] args) {
		Listas l = new Listas(); 
		/*l.agregarFinalR(1);
		l.agregarFinalR(2);
		l.agregarFinalR(3);
		System.out.println(l.numNodosR());
		*/ 
		
		l.insertaOrdenadoR(new Series("Breakind Bad", "Drama criminal", 2008));
		l.insertaOrdenadoR(new Series("Mr.Robot", "Techno thriller", 2015));
		l.insertaOrdenadoR(new Series("Better Caull Saul", "Tragedia/Drama criminal", 2015));
		
		System.out.println("Posicion donde los encuentra el metodo busca: ");
		System.out.println(l.busca(new Series("Breaking Bad", "Drama criminal", 2008))); 
		System.out.println(l.busca(new Series("Mr.Robot", "Techno thriller", 2015)));    
		System.out.println(l.busca(new Series("Better Call Saul", "Tragedia/Drama criminal", 2015))); 

		
		/*
		l.insertaOrdenadoR(3);
		l.insertaOrdenadoR(2);
		l.insertaOrdenadoR(5);
		l.insertaOrdenadoR(6);
		l.insertaOrdenadoR(0);
		l.insertaOrdenadoR(8);
		*/
		System.out.println("lista original: " + l);

		l.invierteR(); 
		System.out.println("lista invertida: " + l);
	}
}
