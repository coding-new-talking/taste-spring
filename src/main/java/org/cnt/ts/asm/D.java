package org.cnt.ts.asm;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * @author lixinjie
 * @since 2019-07-18
 */
@Configuration("ddd")
@ComponentScan(basePackages = {"a.b.c", "x.y.z"},
scopedProxy = ScopedProxyMode.DEFAULT,
includeFilters = {@Filter(classes = Integer.class)})
public class D<@Null T extends Number> extends C<@Valid Long, Date> implements A, B {

	protected Long lon = Long.MAX_VALUE;
	
	private String str;
	
	@Autowired(required = false)
	private Date date;
	
	@Resource(name = "aaa", lookup = "bbb")
	private Map<@NotNull String, @Null Object> map;
	
	@Bean(name = {"cc", "dd"}, initMethod = "init")
	public String getStr(@NotNull String sssss, @Null int iiiii, double dddd, @Valid long llll) throws Exception {
		return sssss;
	}
	
}
