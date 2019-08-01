package org.cnt.nots.asm.ann;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
/**
 * @author lixinjie
 * @since 2019-07-24
 */
public @interface Ann0 {

	Ann1 ann1();
}
