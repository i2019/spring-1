package tao.tech.study.spring.springinaction.org.test.spittr.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import tao.tech.study.spring.springinaction.org.test.spittr.data.Spittle;
import tao.tech.study.spring.springinaction.org.test.spittr.data.SpittleRepository;

@Component
public class SpittleRepositoryDao implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		return createSpittleList(count);
	}

    private List<Spittle> createSpittleList(int count) {  
        List<Spittle> spittles = new ArrayList<Spittle>();  
        for (int i = 0; i < count; i++) {  
        	Spittle s=new Spittle("Spittle " + i, new Date());
        	s.setLatitude(new Double(i));
        	s.setLongitude(new Double(i));
            spittles.add(s);  
        }  
        return spittles;  
    }  
}
