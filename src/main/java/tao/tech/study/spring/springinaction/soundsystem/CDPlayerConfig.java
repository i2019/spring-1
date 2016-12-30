package tao.tech.study.spring.springinaction.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@ComponentScan 
在Spring中启用组件扫描,默认会扫描与配置类相同的包,相当于Spring context命名空间的<context:component-scan>元素.
扫描其他的包：
1.将basePackages属性设置为要扫描包的一个数组即可；设置扫描的包之后，下面的子包都会被扫描到。
@ComponentScan(basePackages={"tao.picture","tao.vedio.movie"})
2.basePackageClasses属性所设置的数组中包含了类,这些类所在的包将会作为组件扫描的基础包。
@ComponentScan(basePackageClasses={CompactDisc.class})
*/
@Configuration
//@ComponentScan(basePackages={"tao.tech.study.spring.springinaction"})
@ComponentScan(basePackageClasses={CompactDisc.class})
public class CDPlayerConfig {

}
