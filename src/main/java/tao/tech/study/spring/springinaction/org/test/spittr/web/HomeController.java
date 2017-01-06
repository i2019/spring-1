package tao.tech.study.spring.springinaction.org.test.spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/homepage"})//定义类级别映射
public class HomeController {
	
	//@RequestMapping(value="/",method=GET) //定义方法级别映射
	@RequestMapping(method=GET)
	public String home(){
		return "home";
	}
}
