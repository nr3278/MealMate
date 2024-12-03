<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/stuffbase.jsp">
	<c:param name="title">TOP</c:param>
	<c:param name="body">
		<button onclick="location.href='https://www.google.com/'">従業員作成</button>
				<button onclick="location.href=''">商品登録</button>
				<button onclick="location.href=''">店舗情報変更</button>
				<button onclick="location.href=''">従業員一覧</button>
				<button onclick="location.href=''">商品一覧</button>
	</c:param>
</c:import>