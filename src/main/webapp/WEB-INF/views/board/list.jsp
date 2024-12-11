<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../includes/header.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 


            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            DataTables Advanced Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                    <tr>
                                        <th>번호</th>
                                        <th>제목</th>
                                        <th>작성자</th>
                                        <th>작성일</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="odd gradeX">
                                    <c:forEach var = "board" items = "${list}">
                                        <td><c:out value="${board.bno}"/></td>
                                        <td><c:out value="${board.title}"/></td>
                                        <td><c:out value="${board.writer}"/></td>
                                        <td class="center"><c:out value="${board.writer}"/></td>
                                        <td class="center"><c:out value="${board.regdate}"/></td>
                                    </c:forEach>
                                    </tr>
                                </tbody>
                            </table>
                         

    <!-- /#wrapper -->

<%@include file="../includes/footer.jsp" %>