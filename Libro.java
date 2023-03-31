public class Libro {
	public static double porcIVA;
	private String autor;
	private String titulo;
	private double precioBase;
	
	public Libro(String autor, String titulo, double precio) {
		this.autor = autor;
		this.titulo = titulo;
		this.precioBase = precio;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPrecioFinal() {
		return precioBase + porcIVA*precioBase/100;
	}
	
	public static double getIVA() {
		return porcIVA;
	}
	
	public static void setIVA(double porcIVA) {
		porcIVA = porcIVA;
	}
	
	public String toString() {
		return getTitulo() + ", " + getAutor() + ", " + getPrecioFinal();
	}
}
