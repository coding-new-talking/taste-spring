package org.cnt.ts.beandefinition;

import java.util.stream.Stream;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		showBeanDefNames();
		showBeanDefObject();
	}
	
	public void showBeanDefNames() {
		int bdCount = cac.getBeanDefinitionCount();
		String[] bdNames = cac.getBeanDefinitionNames();
		log.info("bdCount = {}", bdCount);
		log.info("bdNames =>");
		Stream.of(bdNames).forEach(bdName -> log.info(bdName));
	}
	
	public void showBeanDefObject() {
		AnnotationConfigApplicationContext acac = (AnnotationConfigApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdObjects =>");
		BeanDefinition bossBD = clbf.getBeanDefinition("boss");
		log.info("bossBD = {}, -> {}", bossBD, bossBD.getClass());
		BeanDefinition companyBD = clbf.getBeanDefinition("company");
		log.info("companyBD = {}, -> {}", companyBD, companyBD.getClass());
		BeanDefinition littleMingBD = clbf.getBeanDefinition("littleMing");
		log.info("littleMingBD = {}, -> {}", littleMingBD, littleMingBD.getClass());
		BeanDefinition littleQiangBD = clbf.getBeanDefinition("littleQiang");
		log.info("littleQiangBD = {}, -> {}", littleQiangBD, littleQiangBD.getClass());
		
		log.info("littleMingBD == littleQiangBD -> {}", littleMingBD == littleQiangBD);
		log.info("littleMingBD equals littleQiangBD -> {}", littleMingBD.equals(littleQiangBD));
	}
}
