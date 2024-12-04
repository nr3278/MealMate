<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/stuffbase.jsp">
	<c:param name="title">管理 - グループ作成</c:param>
	<c:param name="body">


	<h1>グループ作成</h1>


	<form id="group_reg">
	<div class="name">
	<label>グループ名：</label>
    <input type="text" name="name" id="name" placeholder="グループ名を入力してください"  required>
</div>

<div class="tel">
	<label>電話番号：</label>
    <input type="text" name="tel_num" id="tel_num" placeholder="電話番号を入力してください"  required>
</div>


<div class="mail">
	<label>メールアドレス：：</label>
    <input type="text" name="mail" id="mail" placeholder="メールアドレスを入力してください"  required>
</div>

</form>

<button onclick="location.href=''">作成</button>
<button onclick="location.href=''">キャンセル</button>

	</c:param>
</c:import>