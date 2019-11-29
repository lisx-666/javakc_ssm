<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>商品入库列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">
				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
	                <div class="alert alert-success" role="alert">商品入库详细信息</div>
	                <div class="col-sm-12">
	                	<div class="btn-group hidden-xs" role="group">
                			<button class="btn btn-success col-lg-3" type="button" data-toggle="modal" id="all">
	                            <i aria-hidden="true"></i>全部<span class="badge">12</span>
	                        </button>
	                        <button class="btn btn-danger" type="button" data-toggle="modal" id="unaffirm">
	                            <i aria-hidden="true"></i>待确认<span class="badge">2</span>
	                        </button>
	                        <button class="btn btn-default" type="button" data-toggle="modal" id="unhouse">
	                            <i aria-hidden="true"></i>待入库<span class="badge">4</span>
	                        </button>
							<button class="btn btn-link" type="button" data-toggle="modal" id="finish">
								<i aria-hidden="true"></i>已完成<span class="badge">2</span>
							</button>
							<button class="btn btn-file" type="button" data-toggle="modal" id="close">
								<i aria-hidden="true"></i>已关闭<span class="badge">2</span>
							</button>
		                 </div>
	                </div>
	                <div class="col-sm-12">
	                	<input class="" id="search" name="inhouseId" value="${InstorageEntity.inhouseId}" type="text" placeholder="请输入入库单号"/>
						<select class="my_select_box" data-placeholder="Select Your Options">
							<option value="1" selected>采购入库</option>
							<option value="2">盘盈入库</option>
							<option value="3" disabled>其他入库</option>
						</select>
						<input type="date"  name="testDate" value="请选择初始时间"/>
						<input type="date"  name="testDate" value="请选择结束时间" />
						<button type="button" class="btn btn-success" data-toggle="modal" id="query">
							<i aria-hidden="true"></i>查询
						</button>
						<button type="button" class="btn btn-success" data-toggle="modal" id="else" name="warehouse/instorage/create.jsp">
							<i aria-hidden="true"></i>其他入库
						</button>
	                </div>
				</div>

	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th>序号</th>
					                <th>状态</th>
					                <th>入库单号</th>
									<th>入库类型</th>
									<th>创建时间</th>
									<th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
										<td>0</td>
										<td>${e.inhouseStatus}</td>
						                <td>${e.inhouseId}</td>
						                <td>${e.inhouseType }</td>
						                <td><fmt:formatDate value="${e.createTime}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
										<td>
											<div class="col-md-4">
												<i class="btn" onClick="xiang('${e.inhouseId}')"  title="详情">详情</i>
											</div>
											<div class="col-md-4">
												<i class="btn" onClick="shen('${e.inhouseId}')"  title="详情">审核</i>
											</div>
										</td>
						            </tr>
					            </c:forEach>
					        </tbody>
					    </table>
				    <div class="page">${page}</div>
			     </form>
			</div>

		</div>

<%--		<script type="text/javascript" src="<%=path%>view/warehouse/instorage/js/list.js"></script>--%>
<%--		<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>--%>
<%--		<script type="text/javascript" src="./js/dictionary.js"></script>--%>
		<script src="${path}/static/js/jquery.min.js"></script>
		<script>

			function xiang(ids) {
				//这里需要异步的局部刷新功能特性  同一页面展现两种来自不同表的结果
				url = root + 'inhouse/view/'+ids+'.do';
				// document.location.href=root+'goodsCount/queryGoodsCount.do';
				document.location.href = url;
			};

			// $('#else').click(function()
			// {
			// 	if($.selectedCount('else'))
			// 	{
			// 		var url = root+$(this).attr('name');
			// 		$("#searchForm").attr('action', url).submit();
			// 	}
			// });

		</script>
	</body>
</html>