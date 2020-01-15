package org.cnt.ts.beanannotation;

import java.util.Map;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.StandardAnnotationMetadata;

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
	
	public void showBeanAnn() {
		showBeanAnnotation();
		showSpringApplication1();
		showSpringApplication2();
		showFruitConfig();
		showOrangeFrwk();
		showStandardAnnotationMetadata();
	}
	
	public void showBeanAnnotation() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("ab1");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
	}
	
	public void showSpringApplication1() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("tasteSpringApplication");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(SpringBootApplication.class.getName());
		log.info("sba = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(ComponentScan.class.getName());
		log.info("cs = {}", ann1);
	}
	
	public void showSpringApplication2() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("tasteSpringApplication");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
	}
	
	public void showFruitConfig() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("fruitConfig");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
	}
	
	public void showOrangeFrwk() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("org.cnt.ts.bean.regfruitbd.OrangeFrwk");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
	}
	
	public void showStandardAnnotationMetadata() {
		ConfigurableApplicationContext acac = (ConfigurableApplicationContext)cac;
		ConfigurableListableBeanFactory clbf = acac.getBeanFactory();
		log.info("bdAnnotation =>");
		AnnotatedBeanDefinition bean = (AnnotatedBeanDefinition)clbf.getBeanDefinition("annBean");
		log.info("{}", bean.getClass().getName());
		AnnotationMetadata am = bean.getMetadata();
		log.info("{}", am.getClass().getName());
		Map<String, Object> ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		Map<String, Object> ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
		
		am = new StandardAnnotationMetadata(AnnBean.class, true);
		log.info("{}", am.getClass().getName());
		ann2 = am.getAnnotationAttributes(Ann2.class.getName());
		log.info("ann2 = {}", ann2);
		ann1 = am.getAnnotationAttributes(Ann1.class.getName());
		log.info("ann1 = {}", ann1);
	}
}
