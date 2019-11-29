<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>商品展示列表页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div class="ibox float-e-margins">
				<form id="searchForm" action="">

				<div class="col-sm-12">
					<!-- ------------按钮组 start------------ -->
					<div class="col-md-12">
						<div class="btn-group hidden-xs" role="group">
								<div class="col-md-3">
									<button type="button" class="btn btn-primary " data-toggle="modal" id="all" name="commodity/goods/queryGoods.do">
										<i class="glyphicon glyphicon-list" aria-hidden="true"></i>全部<span class="badge">4</span>
									</button>
								</div>
								<div class="col-md-3">
									<button type="button" class="btn btn-success" data-toggle="modal" id="on" name="commodity/goods/queryOn.do">
										<i class="glyphicon glyphicon-arrow-up" aria-hidden="true"></i>已上架<span class="badge">4</span>
									</button>
								</div>
								<div class="col-md-3">
									<button type="button" class="btn btn-danger" data-toggle="modal" id="no" name="commodity/goods/queryNo.do">
										<i class="glyphicon glyphicon-arrow-down" aria-hidden="true"></i>未上架<span class="badge">4</span>
									</button>
								</div>
								<div class="col-md-2">
									<button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="commodity/goods/create.jsp">
										<i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加
									</button>
								</div>
								<div class="col-md-1">
									<button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="commodity/goods/delete.do">
										<i class="glyphicon glyphicon-trash" aria-hidden="true"></i>多条删除
									</button>
								</div>
		                 </div>
	                </div>
					<div class="col-sm-12">
						<div class="col-sm-3">
							<input class="form-control" id="search1" name="gName" value="${goodsEntity.gName }" type="text" placeholder="查询名称 回车搜索"/>
						</div>
						<div class="col-sm-3">
							<input class="form-control" id="search2" name="gNumber" value="${goodsEntity.gNumber }" type="text" placeholder="查询编号 回车搜索"/>
						</div>
						<div class="col-sm-3">
							<input class="form-control" id="search3" name="categoryId" value="${goodsEntity.categoryId }" type="text" placeholder="查询分类 回车搜索"/>
						</div>
						<div class="col-sm-3">
							<input class="form-control" id="search4" name="tagId" value="${goodsEntity.tagId }" type="text" placeholder="查询标签 回车搜索"/>
						</div>
					</div>
	                 <!-- ------------按钮组 end------------ -->
						<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
						<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		                 <table class="table table-striped table-bordered table-hover table-condensed">
					        <thead>
					            <tr>
					                <th><input type="checkbox" id="checkall"/></th>
					                <th>商品信息</th>
					                <th>当前售价</th>
					                <th>库存</th>
									<th>状态</th>
									<th>操作</th>
					            </tr>
					        </thead>
					        <tbody>
					        	<c:set var="vs"></c:set>
					        	<c:forEach var="e" items="${page.list }" varStatus="v">
						            <tr>
						                <td><input type="checkbox" name="ids" value="${e.gId }"/></td>
										<td class="col-md-4">
											<div class="col-md-12" style="margin-top: 2px;"><span class="col-md-6" style="font-size: 15px">商品编码:${e.gNumber}</span><span class="col-md-6" style="font-size: 15px">所属分类：蟹类-梭子蟹</span></div>
											<div class="col-md-12" style="margin-top: 8px;">
												<div class="col-md-5"><img src="${path}/static/img/profile_small.jpg" alt="..." class="img-rounded" height="120" width="120"></div>
												<div class="col-md-7">
													<div class="col-md-12">冷冻梭子蟹 500g</div>
													<div class="col-md-12" style="margin-top: 80px"><span class="label label-default" >热销</span><span class="label label-success">新品</span></div>
												</div>
											</div>
										</td>
						                <td>当前售价：￥${e.gXprice}</td>
						                <td>${e.gCount}</td>
										<td><zhg:show value="${e.gStatus}" codeTp="gStatus"></zhg:show></td>
										<td>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-list-alt" onClick="detail('${e.gId}')" title="详情"></i>
											</div>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-pencil" onClick="update('${e.gId}')" title="修改"></i>
											</div>
											<div class="col-md-4">
												<i class="glyphicon glyphicon-trash" onClick="delete1('${e.gId}')" title="删除"></i>
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


	<script src="${path}/static/js/jquery.min.js">
		function detail(ids) {
			url = root + 'commodity/goods/detail/'+ids+'.do';
			document.location.href = url;
		};

		function delete1(ids) {
			url = root + 'commodity/goods/delete/'+ids+'.do';
			document.location.href = url;
		};

		function update(ids) {
			url = root + 'commodity/goods/view/'+ids+'.do';
			document.location.href = url;
		}

		$('#search1').keydown(function(e){
			if(e.keyCode==13){
				$('#searchForm').submit();
			}
		});
		$('#search2').keydown(function(e){
			if(e.keyCode==13){
				$('#searchForm').submit();
			}
		});
	</script>
	</body>
</html>