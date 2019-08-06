package org.cnt.nots.asm.ann;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Inherited
/**
 * @author lixinjie
 * @since 2019-07-24
 */
public @interface Ann1 {

	String name() default "";
}
