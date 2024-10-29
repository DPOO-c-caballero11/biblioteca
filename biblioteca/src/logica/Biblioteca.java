package logica;

import java.io.IOException;
import java.util.ArrayList;

import persistencia.ArchivoCSV;

public class Biblioteca {
	
	private String nombre;
	
	private String direccion;
	
	
	private ArrayList<Libro> libros;
	
	private ArrayList<Cliente> clientes;
	
	public Biblioteca(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.libros = new ArrayList<Libro>();
		this.clientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Libro> getLibros(){
		return libros;
	}
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void settDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public void agregarLibro(String titulo, double rating, String autor, String genero, boolean estaDisponible, int copias) {
		
		Libro nuevoLibro = new Libro(titulo, rating, autor, genero, estaDisponible, copias);
		this.libros.add(nuevoLibro);
				
	}
	
	public void agregarCliente(String nombre, int cedula) {
		
		Cliente nuevoCliente = new Cliente(nombre, cedula);
		nuevoCliente.librosAlquilados = new ArrayList<Libro>();
		this.clientes.add(nuevoCliente);
		
	}
	
	public void guardarLibros() throws IOException{
		ArrayList<String> textos = new ArrayList<String>();
		for(Libro libro: libros) {
			textos.add(libro.toString());
		}
		
		ArchivoCSV.guardarTextoCSV(textos, "libros.csv");
	}
	
	public void guardarClientes() throws IOException{
		ArrayList<String> textos = new ArrayList<String>();
		for(Cliente cliente: clientes) {
			textos.add(cliente.toString());
		}
		
		ArchivoCSV.guardarTextoCSV(textos, "clientes.csv");
	}
	
	public void leerLibros() throws IOException{
		ArrayList<String> textos = ArchivoCSV.leerArchivoCSV("libros.csv");
		for (String texto: textos) {
			String[] valores = texto.split(",");
			Libro libroLeido = new Libro(valores[0], Double.parseDouble(valores[1]), valores[2], valores[3], Boolean.parseBoolean(valores[4]), Integer.parseInt(valores[5]));
			this.libros.add(libroLeido);
			
		}
	}
	
	public void leerClientes() throws IOException{
		ArrayList<String> textos = ArchivoCSV.leerArchivoCSV("clientes.csv");
		for (String texto: textos) {
			String[] valores = texto.split(",");
			Cliente clienteLeido = new Cliente(valores[0], Integer.parseInt(valores[1]));
			this.clientes.add(clienteLeido);
			
		}
		
	}

}
