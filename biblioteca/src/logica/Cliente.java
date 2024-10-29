package logica;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	
	private int cedula;
	
	public ArrayList<Libro> librosAlquilados;
	
	public Cliente(String nombre, int cedula) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		
		this.librosAlquilados = new ArrayList<Libro>();
	}
	
	public ArrayList<Libro> getLibrosAlquilados(){
		
		return this.librosAlquilados;
	}
	
	public void agregarLibroAlquilado(Libro libro) {
		
		this.librosAlquilados.add(libro);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public int getCedula() {
		return this.cedula;
	}
	
	public void setCedula(int cedula) {
		
		this.cedula = cedula;
	}
	
	public void alquilarLibro(Libro libro) {
		
		this.librosAlquilados.add(libro);
		int copiasDisponibles = libro.getCopias();
		libro.setCopias(copiasDisponibles-1);
		
	}
	
	public void devolverLibro(Libro libro) {
		
		int i=0;
		boolean found = false;
		
		while (found == false) {
			
			if (this.librosAlquilados.get(i).equals(libro)) {
				this.librosAlquilados.remove(i);
				int copiasDisponibles = libro.getCopias();
				libro.setCopias(copiasDisponibles+1);
				found = true;
				
			}
			
			i++;
		}
	}
	
    public String toString() {
		
		return this.nombre + "," + this.cedula + "," + this.librosAlquilados;
	}
	
	
	
	

}
