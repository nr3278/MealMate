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
