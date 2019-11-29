<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>测试展示列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">测试详细信息</div>
	                <div class="col-sm-8">
	                	<div class="btn-group hidden-xs" role="group">
							<div class="col-md-5">
								<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="commodity/tag/create.jsp">
									<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
								</button>
							</div>
							<div class="col-md-5">
								<button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="commodity/tag/delete.do">
									<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>多条删除
								</button>
							</div>
		                 </div>
	                </div>
	                <div class="col-sm-4">
	                	<input class="form-control" id="search" name="tagName" value="${tagEntity.tagName }" type="text" placeholder="查询内容 回车搜索"/>
	                </div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>标签名称</th>
					                <th>商品数</th>
					                <th>描述</th>
									<th>
										操作
									</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.tagId }"/></td>
						                <td>${e.tagName }</td>
						                <td></td>
						                <td>${e.tagDescribe }</td>
										<td>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-list-alt" onClick="detail('${e.tagId}')" title="详情"></i>
											</div>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-pencil" onClick="update('${e.tagId}')" title="修改"></i>
											</div>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-trash" onClick="delete1('${e.tagId}')" title="删除"></i>
											</div>
										</td>
						            </tr>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </div>
			     </form>
			</div>
		</div>


	<script>

		function detail(ids) {
			url = root + 'commodity/tag/detail/'+ids+'.do';
			document.location.href = url;
		};

		function delete1(ids) {
			url = root + 'commodity/tag/delete/'+ids+'.do';
			document.location.href = url;
		};

		function update(ids) {
			url = root + 'commodity/tag/view/'+ids+'.do';
			document.location.href = url;
		}

	</script>
	</body>
</html>