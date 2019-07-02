package org.cnt.ts.bean.regmeatbd;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author lixinjie
 * @since 2019-07-02
 */
@Import(RegMeatBd.class)
public @interface EnableMeat {

	String meat();
	
	double weight();
	
	String taste();
}
