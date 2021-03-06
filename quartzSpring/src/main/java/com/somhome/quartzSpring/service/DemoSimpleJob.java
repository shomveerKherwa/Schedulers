package com.somhome.quartzSpring.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoSimpleJob implements Job {

	private Logger log = LoggerFactory.getLogger(DemoSimpleJob.class);

	@Autowired
	private DemoService demoService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		log.info("Job ** {} ** starting @ {}", context.getJobDetail().getKey().getName(), context.getFireTime());
		demoService.perfromServiceLogic();
		log.info("Job ** {} ** completed.  Next job scheduled @ {}", context.getJobDetail().getKey().getName(),
				context.getNextFireTime());

	}

}
