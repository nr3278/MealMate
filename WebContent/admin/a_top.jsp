<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/stuffbase.jsp">
	<c:param name="title">管理 - top</c:param>
	<c:param name="body">


	<h1>TOP</h1>


<form action="/MealMate/admin/a_create_group_1" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">グループ作成</button>
</form>

<button onclick="location.href=''">作成</button>
<button onclick="location.href=''">キャンセル</button>

	</c:param>
</c:import>