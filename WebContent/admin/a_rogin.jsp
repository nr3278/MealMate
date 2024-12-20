<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/adminbase.jsp">
	<c:param name="title">管理 - ログイン</c:param>
	<c:param name="body">

		<form action="/MealMate/admin/rogin" method="post">

			<div class="id">
				<label>ID：</label>
    			<input type="text" name="id" id="id" placeholder="IDを入力してください"  required>
			</div>

			<div class="password">
				<label>パスワード：</label>
    			<input type="text" name="pass" id="pass" placeholder="パスワードを入力してください"  required>
			</div>

<button type="submit">ログイン</button>
		</form>




	</c:param>
</c:import>