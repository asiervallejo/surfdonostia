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

	<section id="call-to-action">
      <div class="container">
        <div class="row aos-init aos-animate" data-aos="zoom-in">
          <div class="col-lg-9 text-center text-lg-left">
            <h3 class="cta-title">Call To Action</h3>
            <p class="cta-text"> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
          </div>
          <div class="col-lg-3 cta-btn-container text-center">
            <a class="cta-btn align-middle" href="#">Call To Action</a>
          </div>
        </div>

      </div>
    </section>
	
	<s:include value="/plantillas/footer.jsp"/>
	<s:include value="/plantillas/styleScripts.jsp"/>

</body>

</html>

