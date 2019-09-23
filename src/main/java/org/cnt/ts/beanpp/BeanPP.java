package org.cnt.ts.beanpp;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinjie
 * @since 2019-09-23
 */
@Slf4j
public class BeanPP {

	private ConfigurableApplicationContext cac;
	private ConfigurableListableBeanFactory bf;
	
	public BeanPP(ConfigurableApplicationContext cac) {
		this.cac = cac;
		this.bf = cac.getBeanFactory();
	}
	
	public void showBeanPP() {
		DefaultListableBeanFactory dbf = (DefaultListableBeanFactory)bf;
		log.info("BPP Count：{}", dbf.getBeanPostProcessorCount());
		log.info("BPP =>");
		dbf.getBeanPostProcessors().forEach(bpp -> {
			String orderType = "";
			String order = "";
			if (bpp instanceof Ordered) {
				orderType = "Ordered";
				order = String.valueOf(((Ordered)bpp).getOrder());
			}
			if (bpp instanceof PriorityOrdered) {
				orderType = "PriorityOrdered";
				order = String.valueOf(((PriorityOrdered)bpp).getOrder());
			}
			log.info("{} {} {}", bpp.getClass().getName(), orderType, order);
		});
	}
}
