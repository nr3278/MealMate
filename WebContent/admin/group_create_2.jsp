<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:import url="/stuffbase.jsp">
	<c:param name="title">管理 - グループ作成_確認</c:param>
	<c:param name="body">

<h1>グループ作成確認</h1>



<table>
<tr>
<td>グループ名</td>
<td>がちんこうどん</td>
</tr>
<tr>
<td>電話番号</td>
<td>08080808</td>

</tr>

<tr>
<td>メールアドレス</td>
<td>dfgfdg@dfg.df</td>

</tr>



</table>


    <c:forEach var="groupDate" items="${groupDate}">
        <table border="1">
            <tr>
                <td>グループ名</td>
                <td>${gruName}</td>
            </tr>
            <tr>
                <td>電話番号</td>
                <td>${tel}</td>
            </tr>
            <tr>
                <td>メールアドレス</td>
                <td>${mail}</td>
            </tr>
            </table>
    </c:forEach>

    <p>上記のグループを作成しますか？</p>

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