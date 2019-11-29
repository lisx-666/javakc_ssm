<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>测试添加页面</title>
	<%@ include file="../../../common/jsp/header.jsp"%>
	<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
	<div>
		<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
	</div>
	<div class="ibox float-e-margins">
		<input type="hidden" name="tagId" value="${tagEntity.tagId}"/>
			<fieldset>
				<legend>标签详细信息</legend>
				<div class="form-group">
					<h1>名称 : ${tagEntity.tagName}</h1>
				</div>
				<div class="form-group">
					<h1>详情 : ${tagEntity.tagDescribe}
				</div>
			</fieldset>
			<fieldset>
				<div>
					<table class="table table-striped table-bordered table-hover table-condensed">
						<thead>
						<tr>
							<th>商品名称</th>
							<th>商品编号</th>
							<th>所属分类</th>
							<th>状态</th>
						</tr>
						</thead>
						<tbody>
						<c:set var="vs"></c:set>
						<c:forEach var="e" items="${page.list }" varStatus="v">
							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</fieldset>
	</div>
</div>
</body>
<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
<script type="text/javascript" src="./js/dictionary.js"></script>
</html>