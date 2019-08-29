package org.cnt.ts.innerbeandef;

import org.cnt.tss.innerbeandef.OutterWithImport;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author lixinjie
 * @since 2019-08-29
 */
@Configuration
@ConditionalOnBean(name = "haha")
public class OutterWithoutAnn {

	//内部类会被编译为单独的.class文件
	//所以使用扫描方式注册bean定义时
	//它不受外部类的任何影响
	@Import(OutterWithImport.class)
	@Configuration
	public static class InnerClass1 {
		
	}
	
	@Component
	public static class InnerClass2 {
		
	}
	
	public static class InnerClass3 {
		
	}
	
	@Bean
	public InnerClass3 innerClass3() {
		return new InnerClass3();
	}
}
