package org.cnt.ts.beandefinition;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixinjie
 * @since 2020-01-27
 */
@RequestMapping("/bean")
@RestController
public class BeanController {

	@Autowired
	private ConfigurableApplicationContext cac;
	
	@RequestMapping("/classes")
	public String[] beanClasses() {
		String[] names = cac.getBeanDefinitionNames();
		String[] classes = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			classes[i] = cac.getBean(names[i]).getClass().getName();
		}
		return classes;
	}
	
	@RequestMapping("/beans")
	public String[] beans() {
		String[] names = cac.getBeanDefinitionNames();
		String[] beans = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			beans[i] = cac.getBean(names[i]).toString();
		}
		return beans;
	}
	
	@RequestMapping("/types")
	public Map<String, String> types(@RequestParam String type) throws BeansException, ClassNotFoundException {
		Map<String, ?> beans = cac.getBeansOfType(Class.forName(type));
		Map<String, String> map = new HashMap<>();
		beans.forEach((key, value) -> {
			map.put(key, value.toString());
			if (value instanceof PriorityOrdered) {
				map.put(key + "_priorityorder", String.valueOf(((PriorityOrdered)value).getOrder()));
			} else if (value instanceof Ordered) {
				map.put(key + "_order", String.valueOf(((Ordered)value).getOrder()));
			}
		});
		return map;
	}
}
