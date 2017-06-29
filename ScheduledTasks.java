package aero.sita.springIntegration.task.numberFileReaderService;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private static final String configFile = "spring-config.xml";

	@Scheduled(fixedRate = 10000)
	public void reportCurrentTime() {
		log.info("The time is now {}", dateFormat.format(new Date())); 
		log.debug("Loaded logging configurations");

		@SuppressWarnings("unused")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		log.debug("Loaded spring context.");
	}
}