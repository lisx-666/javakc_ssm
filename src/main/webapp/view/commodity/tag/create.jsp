<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>标签添加页面</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form action="${path }/commodity/tag/save.do" method="post" class="form-horizontal" role="form">
                    <fieldset>
                        <legend>标签基本信息</legend>
                       <div class="form-group">
                          <label class="col-sm-2 control-label" for="ds_host">标签名称</label>
                          <div class="col-sm-4">
                             <input class="form-control" type="text" name="tagName" />
                          </div>
                       </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host">标签描述</label>
                            <div class="col-sm-4">
                                <input class="form-control" type="text" name="tagDescribe" />
                            </div>
                        </div>
                    </fieldset>
					<fieldset>
						<div>
							<table class="table table-striped table-bordered table-hover table-condensed">
								<thead>
									<tr>
										<th><input type="checkbox" id="checkall"/></th>
										<th>商品名称</th>
										<th>商品编号</th>
										<th>所属分类</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
								<c:set var="vs"></c:set>
								<c:forEach var="e" items="${page.list }" varStatus="v">
									<tr>
										<td><input type="checkbox" name="ids" value=""/></td>
										<td>选择商品</td>
										<td></td>
										<td></td>
										<td></td>
										<td>移除</td>
									</tr>
								</c:forEach>
								</tbody>
							</table>
						</div>
					</fieldset>
                    <fieldset>
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="ds_host"></label>
                           	<div class="col-sm-1">
                              	<input type="submit" value="提交" class="btn btn-primary"/>
                           	</div>
                           	<label class="col-sm-1 control-label" for="ds_host"></label>
                           	<div class="col-sm-4">
                              	<input type="reset" value="重置" class="btn btn-danger" id="resetForm"/>
                           	</div>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/dictionary.js"></script>
</html>