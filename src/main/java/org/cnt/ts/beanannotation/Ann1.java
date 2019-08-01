package org.cnt.ts.beanannotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author lixinjie
 * @since 2019-08-02
 */
public @interface Ann1 {

	String name() default "ann1";
	
	String value() default "ann1";
	
	String abc() default "abc";
}
