<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../includes/header.jsp" %>

<form action="/board/register" method="post">
<div class="form-group">
   <label>제목</label>
   <input class="form-control" name="title">
</div>

<div class="form-group">
   <label>내용</label>
   <textarea class="form-control" rows="3" name="content"></textarea>
</div>

<div class="form-group">
   <label>작성자</label>
   <input class="form-control" name="writer">
</div>
<button type="submit" class="btn btn-default">Submit Button</button>
<button type="reset" class="btn btn-default">Reset Button</button>
</form>

<%@include file="../includes/footer.jsp" %>