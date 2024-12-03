<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:import url="/stuffbase.jsp">
	<c:param name="title">従業員登録</c:param>
	<c:param name="body">


<h1>従業員作成</h1>

			<form id="stuff_reg">
			<div class="input-group">
                <div class="form-name">
                    <label>名前</label>
                    <input type="text" name="s_name" id="s_name" placeholder="名前を入力してください"  required>
                </div>

                <div class="form_mail">
                    <label>メールアドレス</label>
                    <input type="text" name="mail" id="mail" placeholder="メールアドレスを入力してください"  required>
                </div>

</div>

</form>




		<p>店長権限を付与</p>
        <input type="checkbox" name="1" >



<div id="decision">

<div id="confirmed">
        <button type="button" id="confirmed"> 作成 </button>
</div>
<div id="cancel">
        <button type="button" id="cancel"> キャンセル </button>
</div>
</div>

	</c:param>
</c:import>