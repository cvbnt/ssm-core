<%--
  Created by IntelliJ IDEA.
  User: 54654
  Date: 2020/9/24
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
        <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        </head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
        <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--            隐藏域--%>
            <input type="hidden" name="bookID" value="${QBooks.bookID}">
            <div class="form-group">
                <label>书籍名称</label>
                <input type="text" class="form-control" name="bookName" value="${QBooks.bookName}" required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" class="form-control" name="bookCounts" value="${QBooks.bookCounts}" required>
            </div>
            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" class="form-control" name="detail" value="${QBooks.detail}" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="修改">
            </div>
        </form>
    </div>
</div>
</body>
</html>
