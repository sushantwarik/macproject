package main.java.spring.batch.app;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		String[] springConfig = {"jobConfig/jobConfig.xml"};
		@SuppressWarnings("resource")
		ApplicationContext appCtx = new FileSystemXmlApplicationContext(springConfig);
		
		JobLauncher launcher = (JobLauncher) appCtx.getBean("jobLauncher");
		Job job = (Job)appCtx.getBean("helloWorldJob");
		
		try {
			JobExecution exe = (JobExecution) launcher.run(job, new JobParameters());
			System.out.println("Status : " + exe.getExitStatus());
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			e.printStackTrace();
		}
		
	}

}
