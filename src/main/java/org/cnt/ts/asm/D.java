package org.cnt.ts.asm;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
@Component("ddd")
@ComponentScan(basePackages = {"a.b.c", "x.y.z"},
scopedProxy = ScopedProxyMode.DEFAULT,
includeFilters = {@Filter(classes = {Integer.class})})
public class D extends C implements A, B {

}
