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

	<section id="services">
      <div class="container aos-init aos-animate  justify-content-center" data-aos="fade-up">
        <div class="section-header">
          <h3 class="section-title"><s:property value="txtNombre"/></h3>
          <p class="section-description"><s:property value="txtDescripcion"/></p>
        </div>
        <div class="row  justify-content-center">
          <div class="col-lg-4 col-md-6 aos-init aos-animate" data-aos="zoom-in">
            <div class="box">
              <div class="icon"><a href=""><i class="fa fa-photo"></i></a></div>
              <h1 class="section-title"><s:property value="txtPrecio"/>€</h4>
            </div>
          </div>
        </div>
      </div>
    </section>
	
	<s:include value="/plantillas/footer.jsp"/>
	<s:include value="/plantillas/styleScripts.jsp"/>

</body>

</html>



