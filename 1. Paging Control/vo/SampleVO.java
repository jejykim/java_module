public class SampleVO {
	
	private int nowPage = 1;
	
	private int pagePerData = 10;
	
	private int page = 0;
	

	public int getPagePerData() {
		return pagePerData;
	}

	public void setPagePerData(int pagePerData) {
		this.pagePerData = pagePerData;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

}
