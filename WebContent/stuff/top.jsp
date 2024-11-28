<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/stuffbase.jsp">
	<c:param name="title">たいとる</c:param>
	<c:param name="body">
		<button onclick="location.href='https://www.google.com/'">ボタン</button>
	</c:param>
</c:import>