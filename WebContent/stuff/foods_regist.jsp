<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:import url="/stuffbase.jsp">
	<c:param name="title">従業員 - 商品登録</c:param>
	<c:param name="body">


                <div class="form-name">
                    <label>商品名</label>
                    <input type="text" name="pro_name" id="pro_name" placeholder="商品名を入力してください"  required>
                </div>

                <div class="form-jancode">
                    <label>JANコード</label>
                    <input type="text" name="jancode" id="no" placeholder="JANコードを入力してください" value="${ no != null ? no : '' }" required>
                </div>

		<%-- 食材一覧用 ５列ずつ改行
<table>
    <c:forEach var="student" items="${students}" varStatus="status">
        <c:if test="${status.index % 5 == 0}">
            <tr>
        </c:if>

        <td>${student.ent_year}</td>

        <c:if test="${status.index % 5 == 4 || status.last}">
            </tr>
            <tr>
                <td colspan="5">
                    <input type="checkbox" name="selectRow${status.index / 5}">

                </td>
            </tr>
        </c:if>
    </c:forEach>
</table>
		--%>

	</c:param>
</c:import>