package org.cnt.ts.beandefinition;

import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
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
		showBeanDefNames();
		showBeanDefObject();
		showBeanAnnotation();
	}
	
	public void showBeanDefNames() {
		int bdCount = cac.getBeanDefinitionCount();
		String[] bdNames = cac.getBeanDefinitionNames();
		log.info("bdCount = {}", bdCount);
		log.info("bdNames =>");
		Stream.of(bdNames).forEach(bdName -> log.info(bdName));
	}
	
	public void showBeanDefObject() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdObjects =>");
		BeanDefinition tasteSpringApplicationBD = clbf.getBeanDefinition("tasteSpringApplication");
		log.info("tasteSpringApplicationBD = {}, -> {}", tasteSpringApplicationBD, tasteSpringApplicationBD.getClass());
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
	
	public void showBeanAnnotation() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bossBD = (AnnotatedBeanDefinition)clbf.getBeanDefinition("boss");
		Map<String, Object> bossAnno = bossBD.getMetadata().getAnnotationAttributes("org.springframework.stereotype.Component");
		log.info("bossAnno = {}", bossAnno);
		AnnotatedBeanDefinition companyBD = (AnnotatedBeanDefinition)clbf.getBeanDefinition("company");
		Map<String, Object> companyAnno = companyBD.getMetadata().getAnnotationAttributes("org.springframework.context.annotation.Configuration");
		log.info("companyAnno = {}", companyAnno);
		AnnotatedBeanDefinition littleMingBD = (AnnotatedBeanDefinition)clbf.getBeanDefinition("littleMing");
		Map<String, Object> littleMingAnno = littleMingBD.getFactoryMethodMetadata().getAnnotationAttributes("org.springframework.context.annotation.Bean");
		log.info("littleMingAnno = {}", littleMingAnno);
		AnnotatedBeanDefinition littleQiangBD = (AnnotatedBeanDefinition)clbf.getBeanDefinition("littleQiang");
		Map<String, Object> littleQiangAnno = littleQiangBD.getFactoryMethodMetadata().getAnnotationAttributes("org.springframework.context.annotation.Bean");
		log.info("littleQiangAnno = {}", littleQiangAnno);
	}
}
