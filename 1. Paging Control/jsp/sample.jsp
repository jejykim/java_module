<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Sample</title>
</head>
<body>

	<form name="searchForm" action="search.do" method="post">
		<input type="hidden" name="nowPage" id="now_page" value="1"/>

		<!-- 검색 조건 내용 추가 -->
	</form>

	<table class="sub_table" aria-describedby="sample list 테이블">
		<thead>
			<tr>
				<th>title</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="list" items="${sampleList }" varStatus="status">
       			<tr style="cursor: pointer;" class="trHover">
					<td>list</td>
       			</tr>
   			</c:forEach>
			</tbody>
		
			<c:if test="${deviceListCount eq 0}">
				<tr>
   				<td colspan="7">
   					검색결과 없음
   				</td>
   			</tr>
			</c:if>
	</table>

	<!-- paging part -->
	<c:if test="${sampleListCount != 0}">
		<div class="webtong-paging">
			<a class="first" id="first_page" onclick="sampleList.Paging(${pagingVO.startPage })">first page</a>
			<a class="previous" id="pre_page" onclick="sampleList.Paging(${pagingVO.prePage })">previous page</a>
			<span class="numbering">
				<c:forEach var="list" varStatus="status" begin="${pagingVO.firstPage }" end="${pagingVO.lastPage }">
					<c:choose>
							<c:when test="${pagingVO.nowPage eq list }">
								<em>${list }</em>
							</c:when>
							<c:otherwise>
								<a onclick="sampleList.Paging(${list })">${list }</a>
							</c:otherwise>
						</c:choose>
				</c:forEach>
			</span>
			<a class="next" id="next_page" onclick="sampleList.Paging(${pagingVO.nextPage })">next page</a>
			<a class="last" id="last_page" onclick="sampleList.Paging(${pagingVO.endPage })">last page</a>
		</div>
	</c:if>

</body>
</html>