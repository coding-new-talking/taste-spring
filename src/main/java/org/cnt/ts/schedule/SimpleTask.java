package org.cnt.ts.schedule;

import java.util.List;

import org.cnt.ts.schedule.util.ApplicationContextUtils;

/**
 * @author lixinjie
 * @since 2019-09-23
 */
public class SimpleTask {
	
	private SimpleService simpleService;

	public SimpleTask() {
		this.simpleService = ApplicationContextUtils
				.getApplicationContext().getBean(SimpleService.class);
	}
	
	public void runTask() {
		List<String> metadata = simpleService.fetchMetadata("");
		System.out.println(metadata);
	}
}
