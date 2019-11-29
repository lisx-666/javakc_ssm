<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>入库单详情</title>
		<%@ include file="../../../common/jsp/header.jsp"%>
		<link href="${path }/static/css/plugins/file-input/fileinput.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper wrapper-content animated fadeInRight">
			<div>
				<div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
			</div>
			<div class="ibox float-e-margins">
				<form method="post" class="form-horizontal" role="form">
                    <input type="hidden" name="inhouseId" value="${instorageEntity.inhouseId}"/>
                    <fieldset>
                        <legend>入库单详情</legend>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host">入库单编号</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text" name="inhouseId" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host">状态</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text" name="inhouseStatus" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host">入库类型</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text" name="inhouseType" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host">源单据号</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text" name="supplierPhone" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_username">经办人</label>
                            <div class="col-sm-6">
                                <input class="form-control" type="text"  name="inhouseHandle" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_username">备注</label>
                            <div class="col-sm-12">
                                <input class="form-control" type="text"  name="inhouseComment" />
                            </div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div>
                            <table class="table table-striped table-bordered table-hover table-condensed">
                                <thead>
                                <tr>
                                    <th>序号</th>
                                    <th>商品名称</th>
                                    <th>商品编号</th>
                                    <th>单位</th>
                                    <th>入库数量</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:set var="vs"></c:set>
                                <c:forEach var="e" items="${page.list }" varStatus="v">
                                    <tr>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                        <td>0</td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <div class="page">${page}</div>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div class="form-group">
                            <input type="text" value="创建人" class="btn btn-primary" style="border:0 0 1 0 solid black"/>
                            <input type="text" value="创建时间" class="btn btn-success"/>
                            <input type="text" value="审核人" class="btn btn-success"/>
                            <input type="text" value="审核时间" class="btn btn-success"/>
                        </div>
                    </fieldset>
                    <fieldset>
                        <div class="form-group">
                            <label class="col-sm-2 control-label" for="ds_host"></label>
                            <div class="col-sm-1">
                                <input type="submit" value="审核通过" class="btn btn-primary"/>
                            </div>
                            <label class="col-sm-1 control-label" for="ds_host"></label>
                            <div class="col-sm-4">
                                <input type="reset" value="审核不通过" class="btn btn-danger" id="resetForm"/>
                            </div>
                        </div>
                        <div>
                            <input type="text" value="操作说明"/>
                        </div>
                    </fieldset>
                </form>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="${path }/static/js/plugins/file-input/fileinput.min.js"></script>
	<script type="text/javascript" src="./js/dictionary.js"></script>
</html>