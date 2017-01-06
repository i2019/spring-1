package tao.tech.study.spring.springinaction.org.test.spittr.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tao.tech.study.spring.springinaction.org.test.spittr.data.SpittleRepository;
import tao.tech.study.spring.springinaction.org.test.spittr.model.Spittle;

@Controller  
@RequestMapping("/spittles")  
public class SpittleController {  
	
	private static final String MAX_LONG_AS_STRING = "9223372036854775807";
	  
	private SpittleRepository spittleRepository;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
	    this.spittleRepository = spittleRepository;
	}
  
    @RequestMapping(method = RequestMethod.GET)  
    public List<Spittle> spittles(  
    	    @RequestParam(value="max", defaultValue=MAX_LONG_AS_STRING) long max,
            @RequestParam(value="count", defaultValue="20") int count
            //@RequestParam(value="max",defaultValue=1000+"") long max,  
            //@RequestParam(value="count",defaultValue=20+"") int count
   ) {  
        return spittleRepository.findSpittles(max, count);  
    }  
   
    /*
    public String spittles(Model model) {  
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 5));  
        return "spittles";  
    } 
    */ 
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.POST)  
    //@RequestMapping(value = "/show", method = RequestMethod.GET)  
    public String showSpittle(  
            // @RequestParam("spittle_id") long spittleId,  
    		//@PathVariable("spittleId") long spittleId,  
    		@PathVariable long spittleId,//@PathVariable中没有value属性的话，它会假设占位符的名称与方法的参数名相同
            Model model) {  
        model.addAttribute(spittleRepository.findOne(spittleId));  
        return "spittle";  
    }
    
    @RequestMapping(value="/{spittleId}", method=RequestMethod.GET)
    public String spittle(
        @PathVariable("spittleId") long spittleId, 
        Model model) {
      model.addAttribute(spittleRepository.findOne(spittleId));
      return "spittle";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String saveSpittle(SpittleForm form, Model model) throws Exception {
      spittleRepository.save(new Spittle(null, form.getMessage(), new Date(), 
      form.getLongitude(), form.getLatitude()));
      return "redirect:/spittles";
    }
   
}  
