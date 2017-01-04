package tao.tech.study.spring.springinaction.concert;

/*
Performance可以代表任何类型的现场表演，如舞台剧、电影或音乐会。
编写Performance的perform()方法触发的通知。
 */
public interface Performance {
	void perform() throws Throwable;
}
