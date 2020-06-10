@Controller
public class SampleController {

	// 예시 Service
	@Resource(name = "sampleService")
	private SampleService sampleService;

	// Sample List
	@GetMapping(value = "/devices/list.do")
	public String sampleList(ModelMap model, HttpServletRequest req, HttpServletResponse resp, RedirectAttributes redirectAttributes) {
			
		// SampleVO 참조
		SampleVO sampleVO = new SampleVO();
		
		if(sampleVO.getNowPage() != 1) {
			sampleVO.setPage((sampleVO.getNowPage()-1)*sampleVO.getPagePerData());
		}

		// DB 목록
		List<Map<String, Object>> sampleList = sampleService.selectSampleList(sampleVO);

		// 목록 전체 count
		int sampleListCount = sampleService.selectSampleListCount(sampleVO);
		
		PagingControl pc = new PagingControl();
		PagingVO pagingVO = pc.paging(sampleListCount, sampleVO.getNowPage(), sampleVO.getPagePerData());
		
		model.addAttribute("sampleList", sampleList);
		model.addAttribute("sampleListCount", sampleListCount);
		model.addAttribute("pagingVO", pagingVO);
		
		return strReturn;
	}
}