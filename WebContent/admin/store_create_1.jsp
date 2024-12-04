<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/stuffbase.jsp">
	<c:param name="title">管理 - 店舗登録</c:param>
	<c:param name="body">


	<h1>店舗登録</h1>


	<form id="store_reg">
	<div class="name">
	<label>店舗名：</label>
    <input type="text" name="name" id="name" placeholder="店舗名を入力してください"  required>
</div>

<div class="tel">
	<label>電話番号：</label>
    <input type="text" name="tel_num" id="tel_num" placeholder="電話番号を入力してください"  required>
</div>


<div class="mail">
	<label>メールアドレス：</label>
    <input type="text" name="mail" id="mail" placeholder="メールアドレスを入力してください"  required>
</div>

<div class="address">
	<label>住所：</label>
    <input type="text" name="address" id="address" placeholder="住所を入力してください"  required>
</div>

<div class="group">
	<label>グループ：</label>
	<select name="group_list">
	<option>セブン：123</option>
	<option>田口青果：980</option>
	<option>菜々緒：342</option>
	</select>
</div>

</form>

<button onclick="location.href=''">登録</button>
<button onclick="location.href=''">キャンセル</button>

	</c:param>
</c:import>