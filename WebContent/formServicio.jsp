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
		<h3 class="text-center">Agregar un Servicio</h3>
		<div class="row justify-content-center">

			<s:form action="agregarServicio.action" method="POST" cssClass="form" cssStyle="width:500px">
				<s:textfield name="txtNombre" id="txtNombre" cssClass="form-control" label="Nombre"/>
				<div class="form-group">
				<s:textarea name="txtDescripcion" id="txtDescripcion" cssClass="form-control" cssStyle="height:150px" label="Descripcion"/>
				</div>
				<s:textfield name="txtPrecio" id="txtprecio" cssClass="form-control" label="Precio"/>
				<s:submit name="btnAgregar" id="btnAgregar" cssClass="btn btn-info" value="Agregar" />
				<s:actionerror/>
				<s:fielderror/>
			</s:form>
		</div>
	</div>
	
	<s:include value="/plantillas/footer.jsp"/>
	<s:include value="/plantillas/styleScripts.jsp"/>

</body>

</html>



