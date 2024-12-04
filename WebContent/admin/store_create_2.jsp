<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:import url="/stuffbase.jsp">
	<c:param name="title">管理 - 店舗登録_確認</c:param>
	<c:param name="body">

<h1>店舗登録確認</h1>



<table>
<tr>
<td>店舗名</td>
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

<tr>
<td>住所</td>
<td>埼玉県富士見野市123-08</td>

</tr>
<tr>
<td>グループ</td>
<td>麻美青果：134</td>

</tr>



</table>


<%--

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
     --%>


    <p>上記の店舗を作成しますか？</p>

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