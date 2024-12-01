

//	従業員-商品登録
//	「＋」ボタンクリック -> 入力項目追加
document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('addButton').addEventListener('click', function() {
        var form = document.getElementById('foods_reg');
        var clone = form.cloneNode(true);
        document.body.insertBefore(clone, document.getElementById('pro_plus'));
    });
});



//	従業員-店舗情報変更
//	写真をアップロード用
function uploadPhoto() {
    const form = document.getElementById('uploadForm');
    const formData = new FormData(form);

    fetch('UploadServlet', {
        method: 'POST',
        body: formData
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            displayUploadedImages(data.images);
        } else {
            alert('アップロードに失敗しました');
        }
    })
    .catch(error => {
        console.error('Error:', error);
    });
}

function displayUploadedImages(images) {
    const container = document.getElementById('uploadedImages');
    container.innerHTML = ''; // 既存の画像をクリア

    images.forEach(image => {
        const imgElement = document.createElement('img');
        imgElement.src = 'path/to/images/' + image.filename;
        container.appendChild(imgElement);
    });
}