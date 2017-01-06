package tao.tech.study.spring.springinaction.org.test.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tao.tech.study.spring.springinaction.org.test.spittr.data.SpittleRepository;

@Controller  
@RequestMapping("/spittles")  
public class SpittleController {  
	
    private SpittleRepository spittleRepository;  
  
    @Autowired  
    SpittleController(SpittleRepository spittleRepository) {  
        this.spittleRepository = spittleRepository;  
    }  
  
    @RequestMapping(method = RequestMethod.GET)  
    public String spittles(Model model) {  
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 5));  
        return "spittles";  
    }  
}  
