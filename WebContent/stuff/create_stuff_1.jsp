<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>従業員登録</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <!-- ナビゲーションを最上部に配置 -->
    <header>
        <%@ include file="../stuffnav.html" %>
    </header>
    <c:import url="/stuffbase.jsp">
        <c:param name="title">従業員登録</c:param>
        <c:param name="body">
            <h1>従業員作成</h1>

            <form id="stuff_reg">
                <div class="input-group">
                    <div class="form-group">
                        <label for="s_name">名前</label>
                        <input type="text" name="s_name" id="s_name" placeholder="名前を入力してください" required>
                    </div>

                    <div class="form-group">
                        <label for="mail">メールアドレス</label>
                        <input type="text" name="mail" id="mail" placeholder="メールアドレスを入力してください" required>
                    </div>
                </div>
            </form>

            <p>店長権限を付与</p>
            <input type="checkbox" name="manager_permission">

            <div id="decision" class="button-group">
                <button type="button" id="confirmed">作成</button>
                <button type="button" id="cancel">キャンセル</button>
            </div>
        </c:param>
    </c:import>
</body>
</html>
