<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <title>TOP</title>
    <!-- CSSをリンク -->
    <link rel="stylesheet" href="../static/stuff.css">
</head>
<body>
    <!-- ナビゲーションを最上部に配置 -->
    <header>
        <%@ include file="../stuffnav.html" %>
        <h1>従業員メニュー</h1>
    </header>

    <!-- メインコンテンツ -->
    <main>
        <c:import url="/stuffbase.jsp">
            <c:param name="title">TOP</c:param>
            <c:param name="body">
                <button class="button-top" id="food" onclick="location.href=''">商品一覧</button>
                <button class="button-top" id="food" onclick="location.href=''">商品登録</button>
                <button class="button-top" id="store" onclick="location.href=''">店舗情報変更</button>            
                <button class="button-top" id="stuff" onclick="location.href=''">従業員一覧</button>
                <button class="button-top" id="stuff" onclick="location.href=''">従業員作成</button>
            </c:param>
        </c:import>
    </main>
</body>
</html>
