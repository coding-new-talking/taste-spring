package org.cnt.ts.beanannotation;

import java.util.Map;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.AnnotationMetadata;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lixinjie
 * @since 2019-06-25
 */
@Slf4j
public class BeanAnn {

	private ConfigurableApplicationContext cac;
	
	public BeanAnn(ConfigurableApplicationContext cac) {
		this.cac = cac;
	}
	
	public void showBeanDef() {
		showBeanAnnotation();
	}
	
	public void showBeanAnnotation() {
		AnnotationConfigApplicationContext acac = (AnnotationConfigApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition tasteSpringApplication = (AnnotatedBeanDefinition)clbf.getBeanDefinition("tasteSpringApplication");
		AnnotationMetadata am = tasteSpringApplication.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> bossAnno = am.getAnnotationAttributes(SpringBootApplication.class.getName());
		log.info("bossAnno = {}", bossAnno.getClass().getName());
	}
}
