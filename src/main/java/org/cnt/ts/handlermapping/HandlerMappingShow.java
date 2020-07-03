package org.cnt.ts.handlermapping;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.function.support.RouterFunctionMapping;
import org.springframework.web.servlet.handler.AbstractUrlHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinjie
 * @since 2020-01-27
 */
@Slf4j
public class HandlerMappingShow {

	private ConfigurableApplicationContext cac;
	
	public HandlerMappingShow(ConfigurableApplicationContext cac) {
		this.cac = cac;
	}
	
	public void show() {
		Map<String, HandlerMapping> hmm = cac.getBeansOfType(HandlerMapping.class);
		hmm.forEach((name, hm) -> {
			log.info("{}，{}，{}", name, ((Ordered)hm).getOrder(), hm);
			if (hm instanceof RequestMappingHandlerMapping) {
				log.info("{}", ((RequestMappingHandlerMapping)hm).getHandlerMethods());
			} else if (hm instanceof AbstractUrlHandlerMapping) {
				log.info("{}", ((AbstractUrlHandlerMapping)hm).getHandlerMap());
			} else if (hm instanceof RouterFunctionMapping) {
				log.info("{}", ((RouterFunctionMapping)hm).getRouterFunction());
			}
		});
	}
}
