public class LibroOferta extends Libro {
	private double porcDescuento;
	public LibroOferta(String autor, String titulo, double precioBase, double dto) {
		super(autor, titulo, precioBase);
		dto = porcDescuento;
	}
	
	public double getDescuento() {
		return porcDescuento;
	}
	
	public double getPrecioFinal() {
		return super.getPrecioFinal() - porcDescuento;
	}
	
	public String toString() {
		return super.getTitulo() + ", " + super.getAutor() + ", " + getPrecioFinal();
	}

}
