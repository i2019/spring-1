package tao.tech.study.spring.springinaction.demo1;
/*
  Spring的JavaBean就是一个POJO。
  Spring采取非侵入式编程，即这个类在Spring应用和非Spring应用中都可以发挥同样的作用。
 */
public class HelloWorldBean {
	public String sayHello(){
		return "Hello World";
	}
}
