package au.com.spring.batch.app;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/resources/config/job/jobConfig.xml");
		JobLauncher launcher = (JobLauncher)ctx.getBean("jobLauncher");
		
		Job job = (Job)ctx.getBean("dbToXmlJob");
		
		JobExecution exec = (JobExecution)launcher.run(job, new JobParameters());
		
		System.out.println("Status = " + exec.getExitStatus());
	}

}
