/*=======================================================================
Content  : FormLoad
========================================================================*/
$(document).ready(function(){
	try{
		sampleList.PageLoad();
	}
	catch(e){ console.log(e.message); }
	
});


/*=======================================================================
Content  : FormBeforeUnLoad
========================================================================*/
function FormBeforeUnLoad() {
    try {
    }
    catch (e) { console.log(e.message); }
}

/*=======================================================================
sampleList Class 명세 시작 (상수(변수)>>속성>>메서드)
========================================================================*/
//sampleList Class
var sampleList = {};

//sampleList Const

//sampleList Variable
sampleList.page = 1;
sampleList.arrDeviceId = [];

//sampleList
var Properties = {};
sampleList.Properties = Properties;

//sampleList Method
sampleList.PageLoad = function () { };  //메인 페이지 로드 공통 함수
sampleList.SetEvent = function () { };  //메인 페이지 이벤트 바인딩
/*=======================================================================
sampleList Class 명세 끝
========================================================================*/

/*=======================================================================
내      용  : 메인 페이지 로드(PageLoad)
작  성  자  : 김진열
20xx.yy.zz - 최초생성
========================================================================*/
sampleList.PageLoad = function () {
    try {
        sampleList.Init();
        sampleList.SetEvent();
    }
    catch (e) { console.log(e.message); }
}

/*=======================================================================
내      용  : 메인 페이지 초기화
작  성  자  : 김진열
20xx.yy.zz - 최초생성
========================================================================*/
sampleList.Init = function () {
    try {
    }
    catch (e) { console.log(e.message); }
}

/*=======================================================================
내      용  : 이벤트 바인딩(SetEvent)
작  성  자  : 김진열
20xx.yy.zz - 최초생성
========================================================================*/
sampleList.SetEvent = function () {
    try {
    	
    	// 목록 row 값 변경
        $("#page_per_data").change(function (e) {
            e.preventDefault();
            $("#now_page").val(1);
            document.searchForm.submit();
        });
        
        
    }
    catch (e) { console.log(e.message); }
}

/*=======================================================================
내      용  : 페이징
작  성  자  : 김진열
20xx.yy.zz - 최초생성
========================================================================*/
sampleList.Paging = function (page) {
    try {
    	if(page > 0){
    		$("#now_page").val(page);
            
            // 페이지 이동할 form 선택
    		document.searchForm.submit();
    	}else{
    		alert("잘못된 경로 입니다");
    	}
    }
    catch (e) { console.log(e.message); }
}
