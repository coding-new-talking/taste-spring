package org.cnt.ts.bean.regfruitbd;

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
@Import(RegFruitBd.class)
public @interface EnableFruit {
	
	String fruit();

	double weight();
	
	String color();
}
