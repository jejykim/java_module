public class PagingVO {

	// 현재 페이지
	private int nowPage = 1;
	
	// 이전 페이지
	private int prePage;
	
	// 다음 페이지
	private int nextPage;
	
	// 전체 row 수
	private int totalCount;
	
	// 보여질 row 수
	private int pagePerRows = 10;
	
	// 첫 페이지
	private int startPage = 1;
	
	// 마지막 페이지
	private int endPage;
	
	// 보여질 첫 페이지
	private int firstPage = 1;
	
	// 보여질 마지막 페이지
	private int lastPage;

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPagePerRows() {
		return pagePerRows;
	}

	public void setPagePerRows(int pagePerRows) {
		this.pagePerRows = pagePerRows;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

}
