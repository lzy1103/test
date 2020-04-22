<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<table>
<tr>
<td>id</td>
<td>电影名称</td>
<td>导演</td>
<td>票价</td>
<td>上映时间</td>
<td>时长</td>
<td>类型</td>
<td>年份</td>
<td>区域</td>
<td>状态</td>
</tr>
<c:forEach items="${info.list}" var="movie">
<tr>
<td>${movie.id }</td>
<td>${movie.name }</td>
<td>${movie.actor }</td>
<td>${movie.price }</td>
<td>${movie.uptime }</td>
<td>${movie.longtime }</td>
<td>${movie.type }</td>
<td>${movie.years}</td>
<td>${movie.area }</td>
<td>${movie.status}</td>
</tr>
</c:forEach>
</table>
</body>
</html>