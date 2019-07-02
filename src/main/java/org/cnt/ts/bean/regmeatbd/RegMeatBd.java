package org.cnt.ts.bean.regmeatbd;

import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lixinjie
 * @since 2019-07-02
 */
public class RegMeatBd implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//参数importingClassMetadata对应MeatConfig类
		Map<String, Object> attr = importingClassMetadata.getAnnotationAttributes(EnableMeat.class.getName());
		String meat = (String)attr.get("meat");
		if ("鸡肉".equals(meat)) {
			BeanDefinitionBuilder bdb = BeanDefinitionBuilder.genericBeanDefinition(ChickenFrwk.class);
			bdb.addConstructorArgValue(attr);
			registry.registerBeanDefinition(ChickenFrwk.class.getName(), bdb.getBeanDefinition());
		} else if ("牛肉".equals(meat)) {
			BeanDefinitionBuilder bdb = BeanDefinitionBuilder.genericBeanDefinition(BeefFrwk.class);
			bdb.addConstructorArgValue(attr);
			registry.registerBeanDefinition(BeefFrwk.class.getName(), bdb.getBeanDefinition());
		}
	}

}
