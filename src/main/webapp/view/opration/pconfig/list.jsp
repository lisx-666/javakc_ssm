<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>优惠券展示列表页面</title>
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
                			<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="opration/pconfig/create.jsp">
	                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
	                        </button>
<%--	                        <button type="button" class="btn btn-success" data-toggle="modal" id="update" name="pconfig/view.do">--%>
<%--	                            <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改--%>
<%--	                        </button>--%>
<%--	                   <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="pconfig/delete1.do">--%>
<%--	                            <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除--%>
<%--	                        </button>--%>
<%--							<button type="button" class="btn btn-danger" data-toggle="modal" id="detail" name="opration/pconfig/detail.jsp">--%>
<%--								<i class="glyphicon  glyphicon-pencil" aria-hidden="true"></i>详情--%>
<%--							</button>--%>

		                 </div>
	                </div>
	                <div class="col-sm-4">
	                	<input class="form-control" id="search" name="eventName" value="${pconfigEntity.eventName }" type="text" placeholder="查询内容 回车搜索"/>
	                </div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
									<th>活动编号</th>
					                <th>活动名称</th>
					                <th>活动状态</th>
                                    <th>操作</th>

					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list}" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.eventNo}"/></td>
						                <td>${e.eventName}</td>
										<td>${e.eventType}</td>
<%--						                <td><zhg:show codeTp="type" value="${e.couponsType}"/></td>--%>
<%--						                <td><fmt:formatDate value="${e.testDate}" pattern="yyyy-MM-dd"/></td>--%>
										<td>

										</td>
										<td>
											<div class="col-md-3">
												<button type="button"  data-toggle="modal" onClick="detail('${e.eventNo}')"  >
													<i class="glyphicon  glyphicon-pencil" aria-hidden="true"></i>详情
												</button>
<%--											<i class="btn" onClick="detail('${e.eventNo}')"  title="详情">详情</i>--%>
											</div>
											<div class="col-md-3">
												<button type="button" data-toggle="modal" id="delete" name="pconfig/delete.do">
													<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
												</button>
											</div>
											<div>
												<div class="col-md-3">
												<button type="button"  data-toggle="modal" id="update" name="pconfig/view.do">
													<i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>编辑
												</button>
												</div>
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
		<script src="${path}/static/js/jquery.min.js"></script>
		<script>
			function detail(ids) {

					var url = root+ $(this).attr('name');
					document.location.href = root + 'pconfig/detail/' + ids + '.do';

			};


			// function del(ids) {
			// 		url = root+ 'opration/pconfig/del/'+ids+'.do';
			// 	    document.location.href = url;
			// 			//$.isconfirm(url);
			// 		//})
			//
			// }

			// 	$('#delete').click(function () {
			// 		var url = root + $(this).attr('name');
			// 		$.isconfirm(url);
			// 	})
			// ;

		</script>
	</body>
</html>