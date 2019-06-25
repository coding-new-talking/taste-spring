package org.cnt.ts.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2019-06-25
 */
@Configuration
public class Company {

	@Bean
	public Staff littleMing() {
		return new Staff();
	}
	
	@Bean
	public Staff littleQiang() {
		return new Staff();
	}
}
