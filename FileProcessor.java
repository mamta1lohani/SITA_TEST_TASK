/**
 * 
 */
package aero.sita.springIntegration.task.numberFileReaderService;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.util.Random;

//import org.apache.log4j.Logger;

/**
 * @author mamta.lohani
 *
 */
public class FileProcessor {

	private static final Logger log = LoggerFactory.getLogger(FileProcessor.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private Random random = new Random();
	/**
	 * 
	 */
	public FileProcessor() {
		
		// TODO Auto-generated constructor stub

		log.info("{} FileProcessor started", dateFormat.format(new Date()));
	}

	public File process(File file) throws Exception {
		Thread.sleep(random.nextInt(10) * 500);
		log.info("Processing File: " + file);
		return file;
	}

}
