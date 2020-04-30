package com.meroeclinic.web.configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class AutomateConfiguration {

    // run scheduler daily at 11 A.M.
    @Scheduled(cron = "0 0 11 * * ?")
    public void cronJobWorks() {
        System.out.println("CRON JOB WORKS !!");
    }
}
