package egovframework.test.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.test.service.TestService;


@Controller
public class TestController {
	
    private final Logger log = LoggerFactory.getLogger(getClass());
    
	
/*	@Autowired
	private TestMapper mapper;
	
 */
	@Autowired
	private TestService service;
	
	@RequestMapping(value = "/test.do")
	public String ModelMapTest(ModelMap model) throws Exception{
		
		log.info("######### SERVICE : " + service.aaaa().toString());
		
		model.addAttribute("data", service.aaaa());
		return "/cmm/sym/cal/EgovNormalCalPopup";
	}

}
