<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>SurfDonostia</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">
  <sj:head jqueryui="true" jquerytheme="flick"/>
  <s:include
	value="/plantillas/styleLinks.jsp"
/>

</head>

<body>
	<s:include value="/plantillas/header.jsp"/>

	<div class="container" id="contact">			
		<h3 class="text-center">Enviar Consulta</h3>
		<div class="row justify-content-center">
			<s:url
			var="urlServicios" 
			action="listarServicios"
		/>
		<s:form action="enviarEmail.action" method="POST" cssClass="form">
			<s:textfield name="txtNombre" id="txtNombre" cssClass="form-control" label="Nombre"/>
			<s:textfield name="txtEmail" id="txtEmail" cssClass="form-control" label="Email"/>
			<s:textfield name="txtMovil" id="txtMovil" cssClass="form-control" label="Movil"/>
			<s:textarea name="txtComentario" id="txtComentario" cssClass="form-control" label="Comentario"/>			
			<sj:select
				href="%{urlServicios}"
				id="selServicios"
				name="selServicios"
				listKey="id"
				listValue="nombre"
				list="lista_servicios"
				headerKey="-1"
				headerValue="-Seleccione un servicio-"
				label="Estoy interesado en"
			/>
			<s:submit name="btnEnviar" id="btnEnviar" cssClass="btn btn-warning"  value="Enviar"/>
			<s:actionerror/>
			<s:fielderror/>
		</s:form>
		</div>
	</div>
	
	<s:include value="/plantillas/footer.jsp"/>
	<s:include value="/plantillas/styleScripts.jsp"/>

</body>

</html>



