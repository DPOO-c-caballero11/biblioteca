package presentacion;

import java.io.IOException;

import presentacion.Consola;
import logica.Biblioteca;
import logica.Cliente;
import logica.Libro;

public class Consola {

	private Biblioteca biblioteca;
	
	public Consola() {
		this.biblioteca = new Biblioteca("Barnes and Noble", "cra 4 # 70");
		crearObjetos();
		guardar();
		leer();
		
	}
	
	public void leer() {
		
		try {
			this.biblioteca.leerLibros();
			for(Libro libro: this.biblioteca.getLibros()) {
				System.out.println(libro.toString());
			}
			this.biblioteca.leerClientes();
			for(Cliente cliente: this.biblioteca.getClientes()) {
				System.out.println(cliente.toString());
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void guardar() {
		
		try {
			
			this.biblioteca.guardarLibros();
			this.biblioteca.guardarClientes();
	
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void crearObjetos() {
		
		this.biblioteca.agregarLibro("Harry Potter", 5, "J.K. Rowling", "Fantasy", true, 100);
		this.biblioteca.agregarLibro("The Selection", 4, "Kiera Cass", "Romance", true, 50);
		this.biblioteca.agregarLibro("Throne of Glass", 4.5 , "Sarah J. Mass", "Fantasy", false, 20);
		this.biblioteca.agregarLibro("Red Queen", 3.9, "Victoria Aveyard", "Fantasy", true, 30);
		this.biblioteca.agregarCliente("Camila Caballero", 1234567);
	}
	
	public static void main(String[] args) {
		new Consola();
	}
}
