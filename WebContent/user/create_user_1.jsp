<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!-- 実験的にスタッフベースを継承 -->
<c:import url="/stuffbase.jsp">


	<c:param name="title">user - rogin</c:param>
	<c:param name="body">

実験的にスタッフベースを継承している
	<h1>ROGIN</h1>
	IDはランダム


<form action="/MealMate/user/create_user_1" method="post">
				<div class="name">
				<label>NAME：</label>
    			<input type="text" name="name" id="name" placeholder="John Smith"  required>
			</div>

				<div class="email">
				<label>EMAIL：</label>
    			<input type="text" name="email" id="email" placeholder="Email address"  required>
			</div>


					<div class="password">
				<label>PASSWORD：</label>
    			<input type="text" name="pass" id="pass" placeholder="password"  required>
			</div>








	<div class="langList">

	<label for="language_list">Language：</label>
<select id="language_list" name="language_list">
    <c:forEach var="lang" items="${languageList}">
        <option value="${lang.id}">${lang.name}</option>
    </c:forEach>
</select>
</div>



<button type="submit">アカウント作成</button>

</form>


	</c:param>
</c:import>