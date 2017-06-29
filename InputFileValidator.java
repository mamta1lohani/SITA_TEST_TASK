package aero.sita.springIntegration.task.numberFileReaderService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.messaging.Message;

public class InputFileValidator {

	private static final Logger log = LoggerFactory.getLogger(InputFileValidator.class);

	public String validateFile(Message<String> msg) {
		String fileName = (String) msg.getHeaders().get("file_name");
		String content = msg.getPayload();
		log.debug("{}:{}", fileName, content);
		String channel = validateFileContent(content);
		log.info("{}:{} DONE", fileName, channel);
		return channel;
	}

	private String validateFileContent(String content) {
		String isValid = "validFileChannel"; 
		for (String val : content.split("\n")) {
			try {
				Long.parseLong(val.trim());
			} catch (NumberFormatException e) {
				isValid = "invalidFileChannel";
				break; 
			}
		}
		return isValid;
	}
}
