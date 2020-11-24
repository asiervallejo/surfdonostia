package com.web.models;

public class Email {
	private String nombre,email,movil,comentario;
	private int servicio;

	public Email(String nombre, String email, String movil, String comentario, int servicio) {
		this.nombre = nombre;
		this.email = email;
		this.movil = movil;
		this.comentario = comentario;
		this.servicio=servicio;
	}



	@Override
	public String toString() {
		return "Email [nombre=" + nombre + ", email=" + email + ", movil=" + movil + ", comentario=" + comentario
				+ ", Id_servicio=" + servicio + "]";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}



	public int getServicio() {
		return servicio;
	}



	public void setServicio(int servicio) {
		this.servicio = servicio;
	}
	
	
	
	
}
