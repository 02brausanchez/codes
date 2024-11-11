package apanloo;

public class Main {
	public static void main(String[] args) throws ExceptionSeries {
		try {
			Listas l = new Listas(4); 

			l.insertaOrdenado(new Series("Breaking Bad", "Drama criminal", 2015));
			l.insertaOrdenado(new Series("Mr.Robot", "Techno thriller", 2015));
			l.insertaOrdenado(new Series("Better Caull Saul", "Tragedia/Drama criminal", 2015));
			//l.extraer();
			l.insertaOrdenado(new Series("Stranger Things", "Misterio", 2016));
			
			System.out.println("-lista original: " + l + "\n");

			l.invierteR(); 
			System.out.println("-lista invertida: " + l + "\n");

			System.out.print("Posicion de Mr.Robot con metodo busca: ");
			System.out.print(l.busca(new Series("Mr.Robot", "Techno thriller", 2015)));    
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
