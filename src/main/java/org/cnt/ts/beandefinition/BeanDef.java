package org.cnt.ts.beandefinition;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinjie
 * @since 2019-06-25
 */
@Slf4j
public class BeanDef {

	private ConfigurableApplicationContext cac;
	
	public BeanDef(ConfigurableApplicationContext cac) {
		this.cac = cac;
	}
	
	public void showBeanDef() {
		int bdCount = cac.getBeanDefinitionCount();
		String[] bdNames = cac.getBeanDefinitionNames();
		log.info("bdCount = {}", bdCount);
		log.info("bdNames =>");
		Stream.of(bdNames).forEach(bdName -> log.info(bdName));
		String[] aliases = cac.getAliases("littleMing");
		log.info("aliases = {}", Arrays.asList(aliases));
	}
}
