package com.web.dispatcher;



import com.opensymphony.xwork2.ActionSupport;
import com.web.models.Email;

@SuppressWarnings("serial")
public class ContactoDispatcher extends ActionSupport {
		Email mail;
		private String txtNombre,txtEmail,txtMovil,txtComentario;
		private int selServicios;
			
		
		public String enviarEmail() {
			mail=new Email(txtNombre,txtEmail,txtMovil,txtComentario,selServicios);
			System.out.println(mail.toString());
			if (txtNombre!=null && txtEmail!=null && txtMovil!=null && txtComentario!=null) {
				return SUCCESS;
			} else {
				addActionError("Debe rellenar todos los campos.");
				return ERROR;
			}
		}
		public String jquery() {
			
			return SUCCESS;
		}
		
		//GETTER - SETTER
		public String getTxtNombre() {
			return txtNombre;
		}
		public void setTxtNombre(String txtNombre) {
			this.txtNombre = txtNombre;
		}
		public String getTxtEmail() {
			return txtEmail;
		}
		public void setTxtEmail(String txtEmail) {
			this.txtEmail = txtEmail;
		}
		public String getTxtMovil() {
			return txtMovil;
		}
		public void setTxtMovil(String txtMovil) {
			this.txtMovil = txtMovil;
		}
		public String getTxtComentario() {
			return txtComentario;
		}
		public void setTxtComentario(String txtComentario) {
			this.txtComentario = txtComentario;
		}
		public int getSelServicios() {
			return selServicios;
		}
		public void setSelServicios(int selServicios) {
			this.selServicios = selServicios;
		}

		

		//---------------------

		
}
