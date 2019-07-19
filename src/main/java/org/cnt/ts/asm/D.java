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
public class D<@Null String> extends C implements A, B {

	protected Long lon = Long.MAX_VALUE;
	
	private String str;
	
	@Autowired(required = false)
	private Date date;
	
	@Resource(name = "aaa")
	private Map<@NotNull String, @Null Object> map;
	
	@Bean(name = {"cc", "dd"}, initMethod = "init")
	public String str(@NotNull String sssss, @Null int iiiii, double dddd, @Valid long llll) throws Exception {
		return sssss;
	}
	
	
}
