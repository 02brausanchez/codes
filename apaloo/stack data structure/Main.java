package pilas;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
      PilaL a = new PilaL();
      a.push(1);
      a.push(2);
      a.push(3);
      a.push(5);
      a.push(9);

      System.out.println("Pila ligadas con Nodos ");
      System.out.println(a.pop());
      System.out.println(a.pop());
      System.out.println(a.pop());
      System.out.println(a.pop());
      System.out.println(a.pop());
      System.out.println(a.eliminaUltimo());
      
      StackA s = new StackA(5);
      s.push(2);
      s.push(2);
      s.push(5);
      s.push(9);
      s.push(777);

      System.out.println("Pila con arrays ");
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());
      System.out.println(s.pop());

      System.out.println("Uso del Lenguaje: como LinkesList: ");
      Queue<Integer> q = new LinkedList<>();
      q.add(1);
      q.add(2); 
      q.add(5); 
      
      System.out.println("Con foreach: ");
      for(Integer i:q){
         System.out.println(i);
      }

      System.out.println("Con Itearator: ");
      Iterator it = q.iterator(); 
      
      while(it.hasNext()){
         System.out.println(it.next());
      }
      System.out.println(q);
      
      System.out.println("El tam actual del LinkedList: "+q.size()); 
      /* 
      while(!q.isEmpty()){
      System.out.println(q.remove());
      }
      */
      
      System.out.println("Con uso de Array");
      Object [] datos = q.toArray(); 
      for(int i = 0; i < datos.length; i++){
         System.out.println(i+" "+(Integer)(datos[i]));
      }

      Queue<Alumno> c2 = new LinkedList<Alumno>(); 
      c2.add(new Alumno(2223073301L, "Eduardo Morales")); 
      c2.add(new Alumno(2334234, "Alan S")); 
      System.out.println(c2);
      

      Queue<VideoJuegos> c3 = new LinkedList<VideoJuegos>();
      c3.add(new VideoJuegos("Gears of war ", "acción/horror", 2006, 299));
      c3.add(new VideoJuegos("Crash Team Racing", "carreras", 1999, 200));
      c3.add(new VideoJuegos("God of war ", "acción/aventura", 2005, 270));
      c3.add(new VideoJuegos("Devil may cry 5 ", "Acción, hack and slash ", 2019, 500));
      System.out.println(c3);

      while(!q.isEmpty()){
         System.out.println(q.remove());
      }
      
   }
}

