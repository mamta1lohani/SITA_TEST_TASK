package aero.sita.springIntegration.task.numberFileReaderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;

import org.springframework.integration.file.FileNameGenerator;

public class ErrFileNameGenerator implements FileNameGenerator { 

	private static final Logger log = LoggerFactory.getLogger(ErrFileNameGenerator.class);

	/**
	 * Method to update the filename by FileWritingMessageHandler
	 * 
	 * @param message
	 * @return the updated file name
	 */
	public String generateFileName(Message<?> message) {
		String fileName =message.getHeaders().get("file_name").toString();
		String processedName = fileName + ".error";
		log.info("{}:{} ", fileName, processedName);
		return processedName;
	}
}
