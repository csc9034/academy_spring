<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">제품 상세정보</h3>
				</div>
				<!-- /.box-header -->

<form role="form" action="modifyPage" method="post">

	<input type='hidden' name='prodcod' value="${productVO.prodcod}"> <input
		type='hidden' name='page' value="${cri.page}"> <input
		type='hidden' name='perPageNum' value="${cri.perPageNum}">
	<input type='hidden' name='searchType' value="${cri.searchType}">
	<input type='hidden' name='keyword' value="${cri.keyword}">
	

</form>

				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">제품명</label> <input type="text"
							name='prodname' class="form-control" value="${productVO.prodname}"
							readonly="readonly">
					</div>
					<div class="form-group">
					
						<c:set var="fmtprice" scope="page">
							<fmt:parseNumber value="${productVO.price}" integerOnly="true"/>
						</c:set>
						
						<!-- <fmt:parseNumber value="${product.price }" integerOnly="true"/> -->
					
						<label for="exampleInputEmail1">가격</label> <input type="text"
							name='prodname' class="form-control" value="${fmtprice}"
							readonly="readonly">
							
					</div>
					<div class="form-group">
						<label for="exampleInputEmail1">수량</label> <input type="text"
							name="writer" class="form-control" value="${productVO.quantity}"
							readonly="readonly">
					</div>
					<div class="form-group">
						
						<c:set var="fmtregdate" scope="page">
							<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${productVO.regdate}" />
						</c:set>
						
						<label for="exampleInputEmail1">작성일</label> <input type="text"
							name="writer" class="form-control" value="${fmtregdate}"
							readonly="readonly">
							
					</div>
					<div class="form-group">
					
						<c:set var="fmtmoddate" scope="page">
							<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${productVO.moddate}" />
						</c:set>
						
						<label for="exampleInputEmail1">수정일</label> <input type="text"
							name="writer" class="form-control" value="${fmtmoddate}"
							readonly="readonly">
					</div>
				</div>
				<!-- /.box-body -->

				<div class="box-footer">
					<button type="submit" class="btn btn-warning">수정</button>
					<button type="submit" class="btn btn-danger">삭제</button>
					<button type="submit" class="btn btn-primary">목록으로</button>
				</div>


<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			formObj.attr("action", "/shop/modifyPage");
			formObj.attr("method", "get");
			formObj.submit();
		});

		$(".btn-danger").on("click", function() {
			formObj.attr("action", "/shop/removePage");
			formObj.submit();
		});

		$(".btn-primary").on("click", function() {
			formObj.attr("method", "get");
			formObj.attr("action", "/shop/list");
			formObj.submit();
		});

	});
</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
