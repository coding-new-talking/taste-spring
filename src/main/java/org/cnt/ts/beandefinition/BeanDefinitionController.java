package org.cnt.ts.beandefinition;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.type.MethodMetadata;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2020-01-27
 */
@RequestMapping("/bd")
@RestController
public class BeanDefinitionController {

	@Autowired
	private ConfigurableApplicationContext cac;
	
	@RequestMapping("/names")
	public String[] beanNames() {
		return cac.getBeanDefinitionNames();
	}
	
	@RequestMapping("/classes")
	public String[] beanClasses() {
		String[] names = cac.getBeanDefinitionNames();
		String[] classes = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			classes[i] = cac.getBeanFactory().getBeanDefinition(names[i]).getClass().getName();
		}
		return classes;
	}
	
	@RequestMapping("/defs")
	public String[] beanDefs() {
		String[] names = cac.getBeanDefinitionNames();
		String[] bds = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			bds[i] = cac.getBeanFactory().getBeanDefinition(names[i]).toString();
		}
		return bds;
	}
	
	@RequestMapping("/types")
	public String[] beanTypes() {
		String[] names = cac.getBeanDefinitionNames();
		String[] types = new String[names.length];
		BeanDefinition bd;
		MethodMetadata mm;
		for (int i = 0; i < names.length; i++) {
			bd = cac.getBeanFactory().getBeanDefinition(names[i]);
			types[i] = bd.getBeanClassName();
			if (bd instanceof AnnotatedBeanDefinition) {
				mm = ((AnnotatedBeanDefinition)bd).getFactoryMethodMetadata();
				if (mm != null) {
					types[i] = mm.getReturnTypeName();
				}
			}
		}
		return types;
	}
}
