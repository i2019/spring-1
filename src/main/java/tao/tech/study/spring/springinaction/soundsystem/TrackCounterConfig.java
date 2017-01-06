package tao.tech.study.spring.springinaction.soundsystem;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	/**
	 * 创建sgtPeppers实例
	 * @return
	 */
	@Bean
	public CompactDisc sgtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setArtist("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		// ...other tracks omitted for brevity...
		cd.setTracks(tracks);
		return cd;
	}

	/**
	 * 计数的切面
	 * @return
	 */
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
