<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/adminbase.jsp">
	<c:param name="title">管理 - top</c:param>
	<c:param name="body">


	<h1>TOP</h1>
<form action="/MealMate/admin/0013" method="post">
    <!-- フォームの入力フィールド -->
    <button type="submit">
sasa1</button>
</form>


<form action="/MealMate/admin/0012" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">
minnminn</button>
</form>

<form action="/MealMate/admin/create_accounts_1" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">
パスワードを比較</button>
</form>

<form action="/MealMate/map" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">
住所実験</button>
</form>


<form action="/MealMate/admin/a_create_group_1" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">グループ作成</button>
</form>

<form action="/MealMate/admin/a_create_store_1" method="get">
    <!-- フォームの入力フィールド -->
    <button type="submit">店舗作成</button>
</form>

<button onclick="location.href=''">作成</button>
<button onclick="location.href=''">キャンセル</button>

	</c:param>
</c:import>