package com.web.dispatcher;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.web.models.Servicio;
import com.web.models.ServicioDAO;

@SuppressWarnings("serial")
public class ServicioDispatcher extends ActionSupport {
	
	ArrayList<Servicio> lista_servicios = new ArrayList<Servicio>();
	private String txtNombre,txtDescripcion;
	private Double txtPrecio;
	private int id;
	private int selServicios;
	
	public String servicios() {
		return SUCCESS;		
	}
	
	public String listarServicios() {
		ArrayList<Servicio> servicios=new ArrayList<Servicio>();
		servicios=new ServicioDAO().listadoServiciosDAO();
		setLista_servicios(servicios);
		//System.out.println("Entra y el resultado: "+ lista_servicios);
		
		return SUCCESS;
	}
	
	public String agregarServicio() {
		
		boolean acceso;
		Servicio servicio=new Servicio();
		servicio.setNombre(txtNombre);
		servicio.setDescripcion(txtDescripcion);
		servicio.setPrecio(txtPrecio);
		acceso=new ServicioDAO().agregarServiciosDAO(servicio);
		if (acceso=true)
			return SUCCESS;
		else
			return ERROR;
	}
	
	public String eliminarServicio() {
		if (new ServicioDAO().eliminarServicioDAO(id)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	public String datosServicio() {
		Servicio servicio=new Servicio();
		servicio=new ServicioDAO().datosServicioDAO(selServicios);
		setTxtNombre(servicio.getNombre());
		setTxtDescripcion(servicio.getDescripcion());
		setTxtPrecio(servicio.getPrecio());
		setId(servicio.getId());

		return SUCCESS;
	}
	public String editarServicio() {
		Servicio servicio=new Servicio();
		servicio.setNombre(txtNombre);
		servicio.setDescripcion(txtDescripcion);
		servicio.setPrecio(txtPrecio);
		servicio.setId(id);
		if (new ServicioDAO().editarServicioDAO(servicio))
			return SUCCESS;
		else
			return ERROR;
		
	}
	
	public ArrayList<Servicio> getLista_servicios() {
		return lista_servicios;
	}
	
	public void setLista_servicios(ArrayList<Servicio> lista_servicios) {
		this.lista_servicios = lista_servicios;
	}
	public String getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(String txtNombre) {
		this.txtNombre = txtNombre;
	}
	public String getTxtDescripcion() {
		return txtDescripcion;
	}
	public void setTxtDescripcion(String txtDescripcion) {
		this.txtDescripcion = txtDescripcion;
	}
	public Double getTxtPrecio() {
		return txtPrecio;
	}
	public void setTxtPrecio(Double txtPrecio) {
		this.txtPrecio = txtPrecio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSelServicios() {
		return selServicios;
	}

	public void setSelServicios(int selServicios) {
		this.selServicios = selServicios;
	}
	
	
	
	
}
