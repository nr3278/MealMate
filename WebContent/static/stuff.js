

//	従業員-商品登録
//	「＋」ボタンクリック -> 入力項目追加
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('addButton').addEventListener('click', function() {
        var form = document.getElementById('foods_reg');
        var clone = form.cloneNode(true);
        document.body.insertBefore(clone, document.getElementById('pro_plus'));
    });
});