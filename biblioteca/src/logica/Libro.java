package logica;

public class Libro {
	
	private String titulo;
	
	private double rating;
	
	private String autor;
	
	private String genero;
	
	private boolean estaDisponible;
	
	private int copias;
	
	
	public Libro(String titulo, double rating, String autor, String genero, boolean estaDisponible, int copias) {
		
		this.titulo = titulo;
		
		this.rating = rating;
		
		this.autor = autor;
		
		this.genero = genero;
		
		this.estaDisponible = estaDisponible;
		
		this.copias = copias;
	}
	
	public String getTitulo() {
		
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}
	
	public double getRating() {
		
		return this.rating;
	}
	
	public void setRating(double rating) {
		
		this.rating = rating;
	}
	
	public String getAutor() {
		
		return this.autor;
	}
	
	public void setAutor(String autor) {
		
		this.autor = autor;
	}
	
	public String getGenero() {
		
		return this.genero;
	}
	
	public void getGenero(String genero) {
		
		this.genero = genero;
	}
	
	public boolean getEstaDisponible() {
		
		return estaDisponible;
	}
	
	public void setEstaDisponible(boolean estaDisponible) {
		
		this.estaDisponible = estaDisponible;
	}
	
	public int getCopias() {
		
		return this.copias;
	}
	
	public void setCopias(int copias) {
		
		this.copias = copias;
	}
	
	
	public void marcarDisponibilidad(boolean disponibilidad) {
		
		setEstaDisponible(disponibilidad);
	}
	
	public String toString() {
		
		return this.titulo + "," + this.rating + "," + this.autor + "," + this.genero + "," + this.estaDisponible + "," + this.copias;
	}
	
}
