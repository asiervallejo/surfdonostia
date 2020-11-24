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
<s:include
	value="/plantillas/header.jsp"
/>

	<section class="d-flex justify-content-center m-5">
		<s:url
			var="urlServicios" 
			action="listarServicios"
		/>
		<sjg:grid
			caption="Servicios disponibles"
			gridModel="lista_servicios"
			dataType="json"
			href="%{urlServicios}"
			id="gridServicios"
			name="gridServicios"
			pager="true"
			rowList="5,10,15"
			rowNum="10"
		>
			<sjg:gridColumn width="50" align="center" name="id" id="id" title="#id" hidden="true"/>
			<sjg:gridColumn width="200" align="center" name="nombre" id="nombre" title="Nombre" sortable="true"/>
			<sjg:gridColumn width="300" align="center" name="descripcion" id="descripcion" title="Descripcion" sortable="true"/>
			<sjg:gridColumn width="100" align="center" name="precio" id="precio" title="Precio" sortable="true" formatter="currency"/>
			<sjg:gridColumn width="300" align="center" name="btnAcciones" id="btnAcciones" title="" formatter="formButtons"/>		
		</sjg:grid>
	</section>
	<section class="text-center m-5">
		<s:url 
			var="urlAgregarServicio"
			action="formServicio"
		/>
		<s:a href="%{urlAgregarServicio}" cssClass="btn btn-info"> Agregar Servicio </s:a>
	</section>
	<!--<section class="text-center m-5">
	<s:form action="datosServicio.action" method="POST" cssClass="form">
		<sj:select
				href="%{urlServicios}"
				id="selServicios"
				name="selServicios"
				listKey="id"
				listValue="nombre"
				list="lista_servicios"
				headerKey="-1"
				headerValue="Seleccione un servicio"

		/>
		
		<button type="submit" id="btnEditar" class="btn btn-success">Editar</button>
	</s:form>	
	
		<button id="btnEliminar" class="btn btn-danger">Eliminar</button>
	
	</section>-->
	
	<s:include
		value="/plantillas/footer.jsp"
	/>
	<s:include
		value="/plantillas/styleScripts.jsp"
	/>
	<script>
		/*
		$("#btnEliminar").click(function(){
			$.ajax({
				url:'eliminarServicio.action',
				dataType:'json',
				data:{id: $("#selServicios").val()},
				success:function(servicios){
					console.log(servicios);
				}
			});
		});
		
		$("#btnEditar").click(function(){	
			$.ajax({
				url:'datosServicio.action',
				data:{id: $("#selServicios").val()},
				success:function(servicio){
					console.log(servicio);
				}
			});
		});*/
		function formButtons(cellvalue, options, rowObject){
			var codigo='<a href="#" title="Eliminar" class="btn btn-danger" onclick="javascript:eliminar('+rowObject.id+')">Eliminar</a>';
				codigo+='<a href="#" title="Editar" class="btn btn-info" onclick="javascript:editar('+rowObject.id+')">Editar</a>';
				codigo+='<a href="#" title="Mostrar" class="btn btn-success" onclick="javascript:mostrar('+rowObject.id+')">Mostrar</a>';
			return codigo;
		};
		function eliminar(id){
			if(confirm('¿ Desea eliminar el servicio con id: '+id+' ?'))
				window.location="eliminarServicio.action?id="+id;		
		}
		function editar(id){
				window.location="datosServicio.action?selServicios="+id;		
		}
		function mostrar(id){
				window.location="mostrarServicio.action?selServicios="+id;		
		}
		

		
	
	</script>

</body>

</html>