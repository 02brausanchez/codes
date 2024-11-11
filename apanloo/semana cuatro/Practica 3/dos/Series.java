 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaamano;
import java.util.Comparator;

public class Series implements Comparable<Series>, Cloneable, Comparator, Copiable {
	String nombreSerie; 
	String generoSerie; 
	int yearSerie; 
	
	public Series(String nombreSerie, String generoSerie, int yearSerie) {
		this.nombreSerie = nombreSerie; 
		this.generoSerie = generoSerie; 
		this.yearSerie = yearSerie; 
	}
	
	@Override 
	public Series clone() throws CloneNotSupportedException{
		return new Series(this.nombreSerie, this.generoSerie, this.yearSerie);
	}
	
	@Override 
	public int compareTo(Series a) {
		return this.nombreSerie.compareTo(a.nombreSerie);
	}
	
	@Override 
	public String toString() {
		String aux = new String(); 
		aux = aux.concat(this.nombreSerie + "" + this.generoSerie + this.yearSerie);
		return aux; 
	}
	
	public void setNombreSeries(String nombreSeries) {
		this.nombreSerie = nombreSerie; 
	}
	
	public String getNombreSerie() {
		return nombreSerie;
	}
	
	public String getGeneroSerie() {
		return generoSerie;
	}
	
	public int getYearSerie() {
		return yearSerie;
	}
	
	@Override 
	public int compare(Object a, Object b) {
		return ((Series)(a)).nombreSerie.compareTo(((Series)b).nombreSerie);
	}
    /**
    *
    * @param a
    * @return
    */
   @Override
   public boolean equals(Object a) {   
         return this.nombreSerie.compareTo(((Series)a).nombreSerie)==0;
   }

	@Override
	public Object copiar() {
		// TODO Auto-generated method stub
		Series  a = new Series(this.nombreSerie, this.generoSerie, this.yearSerie);
		return a;
	}
}