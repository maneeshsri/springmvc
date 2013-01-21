<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<p>
	<h1>Home Page</h1>
	
	<form:form class="form" method="post" modelAttribute="weather">
	   <form:input path="zip" class="input-block-level" placeholder="Zip Code" />
	   <button class="btn btn-large btn-primary" type="submit">Get Weather</button>
	</form:form>
	<p>
		Temparature : <s:eval expression="weather.tempF" />
		
    </p>

</p>