<style>

body {
    font-family: Arial, sans-serif;
    line-height: 1.5;
    margin: 0;
    padding: 0;
    background-color: #f9f9f9;
}

/* コンテナ */
.container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
    background-color: #ffffff;
    border-radius: 8px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

/* フォーム */
form {
    display: flex;
    flex-direction: column;
}

form label {
    margin-top: 10px;
    font-weight: bold;
    color: #333333;
}

form select,
form textarea,
form button {
    margin-top: 5px;
    padding: 10px;
    font-size: 1rem;
    border: 1px solid #cccccc;
    border-radius: 5px;
}

form textarea {
    resize: none;
    height: 100px;
}

form button {
    background-color: #007BFF;
    color: white;
    border: none;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

form button:hover {
    background-color: #0056b3;
}

/* レスポンシブデザイン */
@media (max-width: 768px) {
    .container {
        padding: 15px;
        margin: 10px;
    }

    form label,
    form select,
    form textarea,
    form button {
        font-size: 0.9rem;
    }

    form textarea {
        height: 80px;
    }
}

@media (max-width: 480px) {
    body {
        padding: 10px;
    }

    .container {
        padding: 10px;
    }

    form button {
        padding: 12px;
        font-size: 0.85rem;
    }
}
</style>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
<head>
	<%@ include file="./../userbase.html" %>

<form method="POST" action="/translate">
    <label for="sourceLang">Source Language:</label>
    <select name="sourceLang">
        <option value="en">English</option>
        <option value="ja">Japanese</option>
        <!-- 他の言語 -->
    </select>
    <label for="targetLang">Target Language:</label>
    <select name="targetLang">
        <option value="ja">Japanese</option>
        <option value="en">English</option>


        <!-- 他の言語 -->
    </select>
    <textarea name="text" placeholder="Enter text here"></textarea>
    <button type="submit">Translate</button>
</form>

</head>
