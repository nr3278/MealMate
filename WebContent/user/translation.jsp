<style>

body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
    color: #333;r
    margin: 0;
    padding: 0;
}

.container {
    min-height: 100vh; /* ビューポート全体の高さに対応 */
    display: flex;
    flex-direction: column;
    justify-content: space-between; /* コンテンツを上下に分散 */
    background-color: white; /* 背景色を設定 */
    padding: 20px; /* 余白を調整 */
}

/* ヘッダー */
.header {
    text-align: center;
    background: #007BFF;
    color: white;
    padding: 15px;
    font-size: 1.5rem;
    font-weight: bold;
}

/* 翻訳セクション */
.translation-section {
	min-height: 100vh;
    padding: 15%;
}

.user-block {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 15%;
}

.language-selection {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    margin-bottom: 10px;
}

.language-selection label {
    font-size: 1.2rem;
    font-weight: bold;
}

.record-btn {
    background: #ffcc00;
    border: none;
    font-size: 1.2rem;
    border-radius: 50%;
    padding: 10px;
    cursor: pointer;
    transition: background 0.3s ease;
}

.record-btn:hover {
    background: #ff9900;
}

.output-text1 {
    font-size: 1rem;
    text-align: center;
    margin: 10px 0;
    width: 90%;
    border: 1px solid #ccc;
    padding: 10px;
    border-radius: 5px;
    background: #f9f9f9;
    transform: scale(-1, -1);
}

.output-text2 {
    font-size: 1rem;
    text-align: center;
    margin: 10px 0;
    width: 90%;
    border: 1px solid #ccc;
    padding: 10px;
    border-radius: 5px;
    background: #f9f9f9;
}

.read-aloud-btn,
.translate-btn {
    background: #007BFF;
    color: white;
    border: none;
    border-radius: 5px;
    padding: 10px 20px;
    font-size: 1rem;
    cursor: pointer;
    margin-top: 10px;
    transition: background 0.3s ease;
}

.read-aloud-btn:hover,
.translate-btn:hover {
    background: #0056b3;
}

hr {
    border: 0.5px solid #ddd;
    width: 90%;
    margin: 20px auto;
}

/* レスポンシブ設定 */
@media (max-width: 480px) {
    .output-text {
        font-size: 0.9rem;
        padding: 8px;
    }

    .record-btn {
        padding: 8px;
        font-size: 1rem;
    }

    .read-aloud-btn,
    .translate-btn {
        padding: 8px 15px;
        font-size: 0.9rem;
    }
}
</style>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<%@ include file="./../userbase.html" %>
<body>
    <div class="container">

        <div class="translation-section">
            <!-- 対話相手 -->
            <div class="user-block">
<div class="language-selection">
    <!-- 言語を選択できるドロップダウン -->
    <select id="userLang" name="userLang">
        <option value="ja">Japanese</option>
        <option value="en">English</option>
        <option value="es">Spanish</option>
        <option value="fr">French</option>
        <!-- 必要な言語を追加 -->
    </select>
    <button class="record-btn">🎤</button>
</div>


                <p class="output-text1">私は強い</p>
                <button class="read-aloud-btn">🔊</button>
            </div>

            <hr>

            <!-- 外国人利用者 -->
            <div class="user-block">

                    <div class="language-selection">
    <!-- 言語を選択できるドロップダウン -->
    <select id="userLang" name="userLang">
        <option value="en">English</option>
        <option value="ja">Japanese</option>
        <option value="es">Spanish</option>
        <option value="fr">French</option>
        <!-- 必要な言語を追加 -->
    </select>
    <button class="record-btn">🎤</button>
</div>

                <p class="output-text2">I'm strong.</p>
                <button class="translate-btn">⇧</button>
            </div>
        </div>
    </div>
</body>
</html>

</head>

