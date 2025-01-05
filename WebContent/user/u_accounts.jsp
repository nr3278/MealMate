<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/userbase.jsp">
	<c:param name="title">user - rogin</c:param>
	<c:param name="body">

	<h1>ROGIN</h1>
	IDはランダム



				<div class="name">
				<label>NAME：</label>
    			<input type="text" name="name" id="name" placeholder="John Smith"  required>
			</div>

				<div class="email">
				<label>EMAIL：</label>
    			<input type="text" name="email" id="email" placeholder="Email address"  required>
			</div>


					<div class="password">
				<label>：</label>
    			<input type="text" name="pass" id="pass" placeholder="password"  required>
			</div>








	<div class="langList">

	<label for="language_list">Language</label>
<select id="language_list" name="language_list">
    <c:forEach var="language" items="${languageList}">
        <option value="${group.groupCode},${group.name}">${group.groupCode}：${group.name}</option>
    </c:forEach>
</select>
</div>




	</c:param>
</c:import>