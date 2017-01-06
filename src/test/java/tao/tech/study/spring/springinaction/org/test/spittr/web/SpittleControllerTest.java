package tao.tech.study.spring.springinaction.org.test.spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import tao.tech.study.spring.springinaction.org.test.spittr.data.SpittleRepository;
import tao.tech.study.spring.springinaction.org.test.spittr.model.Spittle;
import static org.mockito.Mockito.*;  
import static org.hamcrest.Matchers.hasItems;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;  

public class SpittleControllerTest {
	
	@Test  
	public void testSpittle() throws Exception {  
	    Spittle expectedSpittle = new Spittle("Hello", new Date());  
	    SpittleRepository mockRepository = mock(SpittleRepository.class);  
	    when(mockRepository.findOne(new Long("1234"))).thenReturn(expectedSpittle);  
	  
	    SpittleController controller = new SpittleController(mockRepository);  
	    MockMvc mockMvc = standaloneSetup(controller).build();  
	  
	    mockMvc.perform(get("/spittles/12345"))  
	            .andExpect(view().name("spittle"))  
	            .andExpect(model().attributeExists("spittle"))  
	            .andExpect(model().attribute("spittle", expectedSpittle));  
	}  
	
	/*
	 * mock测试：不需要提供SpittleRepository接口的实现类即可测试
	 */
	//@Test  
    public void shouldShowRecentSpittles() throws Exception {  
        //step1 准备测试数据  
        List<Spittle> expectedSpittles = createSpittleList(20);  
        SpittleRepository mockRepository = mock(SpittleRepository.class);  
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);  
        SpittleController controller = new SpittleController(mockRepository);  
        MockMvc mockMvc = standaloneSetup(controller)  
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))  
                .build();  
        //step2 and step3  
        mockMvc.perform(get("/spittles"))  
                .andExpect(view().name("spittles"))  
                .andExpect(model().attributeExists("spittleList"))  
                .andExpect(model().attribute("spittleList",  hasItems(expectedSpittles.toArray())));  
    }  
  
    private List<Spittle> createSpittleList(int count) {  
        List<Spittle> spittles = new ArrayList<Spittle>();  
        for (int i = 0; i < count; i++) {  
            spittles.add(new Spittle("Spittle " + i, new Date()));  
        }  
        return spittles;  
    }  
    
}
