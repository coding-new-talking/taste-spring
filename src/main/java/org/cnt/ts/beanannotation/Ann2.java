package org.cnt.ts.beanannotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;

@Retention(RUNTIME)
@Target({TYPE, METHOD})
/**
 * @author lixinjie
 * @since 2019-08-02
 */
@Ann1
public @interface Ann2 {

	@AliasFor("value")
	String name() default "ann2";
	
	@AliasFor("name")
	String value() default "ann2";
	
	@AliasFor(annotation = Ann1.class, attribute = "abc")
	String def() default "def";
}
