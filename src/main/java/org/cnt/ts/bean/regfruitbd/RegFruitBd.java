package org.cnt.ts.bean.regfruitbd;

import java.util.Map;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lixinjie
 * @since 2019-07-02
 */
public class RegFruitBd implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//方法参数importingClassMetadata对应的是FruitConfig类
		Map<String, Object> attr = importingClassMetadata.getAnnotationAttributes(EnableFruit.class.getName());
		String fruit = (String)attr.get("fruit");
		if ("apple".equals(fruit)) {
			return new String[] {AppleFrwk.class.getName()};
		} else if ("orange".equals(fruit)) {
			return new String[] {OrangeFrwk.class.getName()};
		}
		return new String[0];
	}

}
