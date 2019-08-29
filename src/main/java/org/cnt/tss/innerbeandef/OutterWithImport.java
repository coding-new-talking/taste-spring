package org.cnt.tss.innerbeandef;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author lixinjie
 * @since 2019-08-29
 */
@Configuration
@ConditionalOnBean(name = "haha")
public class OutterWithImport {

	//该内部类的外部类是通过@Import引入的
	//所以受到外部类上的@Configuration影响
	//因为源码中判断只有标了这个注解才会去
	//处理内部类
	//肯定也受条件的影响
	@Configuration
	public static class InnerClass4 {
		
	}
	
	@Component
	public static class InnerClass5 {
		
	}
	
	public static class InnerClass6 {
		
	}
	
	//外部类是通过@Import引入的
	//bean方法只是外部类上的条件影响
	//不受外部类上的@Configuration影响
	//即使外部类上没有注解，外部类也会
	//被注册bean定义
	@Bean
	public InnerClass6 innerClass6() {
		return new InnerClass6();
	}
}
