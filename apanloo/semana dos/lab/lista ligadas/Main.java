package apanloo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listas l = new Listas(); 
		/*l.agregarFinalR(1);
		l.agregarFinalR(2);
		l.agregarFinalR(3);
		System.out.println(l.numNodosR());
		*/ 
		
		l.insertaOrdenadoR(1);
		l.insertaOrdenadoR(3);
		l.insertaOrdenadoR(2);
		l.insertaOrdenadoR(5);
		l.insertaOrdenadoR(6);
		l.insertaOrdenadoR(0);
		l.insertaOrdenadoR(8);
		System.out.println("lista original: " + l);

		l.invierteR(); 
		System.out.println("lista invertida: " + l);
	}

}
