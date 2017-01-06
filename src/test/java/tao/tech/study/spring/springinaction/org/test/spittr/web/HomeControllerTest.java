package tao.tech.study.spring.springinaction.org.test.spittr.web;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import tao.tech.study.spring.springinaction.org.test.spittr.data.Spittle;
import tao.tech.study.spring.springinaction.org.test.spittr.data.SpittleRepository;
import static org.junit.Assert.assertEquals;
import static 
org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static
org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static
org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
/*
 * 控制器单元测试
 */
public class HomeControllerTest {
	
	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		
		//jUnit单元测试
		assertEquals("home", controller.home());
		//Mock测试
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}
}
