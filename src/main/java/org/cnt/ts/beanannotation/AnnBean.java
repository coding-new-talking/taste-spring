package org.cnt.ts.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lixinjie
 * @since 2019-08-02
 */
@Configuration
@Ann2(name = "111", def = "xyz")
public class AnnBean {

	@Bean
	@Ann2
	public AnnBean ab1() {
		return new AnnBean();
	}
}
