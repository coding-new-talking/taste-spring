package org.cnt.ts.schedule;

import java.time.LocalDateTime;

import org.cnt.ts.schedule.util.ApplicationContextUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author lixinjie
 * @since 2019-09-23
 */
@Component
public class ScheduleJob {
	
	//@Scheduled(cron = "0/1 * * * * ?")
	public void testTask() {
		SimpleTask task = new SimpleTask();
		task.runTask();
	}
	
	//@Scheduled(cron = "0/1 * * * * ?")
	public void testJob() {
		System.out.println(LocalDateTime.now());
		System.out.println(ApplicationContextUtils.getApplicationContext());
	}
	
}
